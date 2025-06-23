const express = require('express');
const app = express();
const PORT = 3000;

app.use(express.json());

// 🌱 Seeded in-memory data
let items = [
  { id: 1, name: 'Apple', quantity: 10 },
  { id: 2, name: 'Banana', quantity: 5 },
  { id: 3, name: 'Cherry', quantity: 20 },
];

// CREATE
app.post('/items', (req, res) => {
  const { name, quantity } = req.body;
  if (!name || quantity == null) {
    return res.status(400).json({ error: 'Name and quantity are required' });
  }
  const newItem = { id: items.length + 1, name, quantity };
  items.push(newItem);
  res.status(201).json(newItem);
});

// READ all
app.get('/items', (req, res) => {
  res.json(items);
});

// READ one
app.get('/items/:id', (req, res) => {
  const item = items.find(i => i.id === +req.params.id);
  if (!item) return res.status(404).json({ error: 'Not found' });
  res.json(item);
});

// UPDATE
app.put('/items/:id', (req, res) => {
  const item = items.find(i => i.id === +req.params.id);
  if (!item) return res.status(404).json({ error: 'Not found' });
  const { name, quantity } = req.body;
  if (!name && quantity == null) {
    return res.status(400).json({ error: 'Name or quantity must be provided' });
  }
  if (name) item.name = name;
  if (quantity != null) item.quantity = quantity;
  res.json(item);
});

// DELETE
app.delete('/items/:id', (req, res) => {
  const idx = items.findIndex(i => i.id === +req.params.id);
  if (idx === -1) return res.status(404).json({ error: 'Not found' });
  items.splice(idx, 1);
  res.status(204).end();
});

// Root route
app.get('/', (req, res) => res.send('Welcome to the Item API!'));

app.listen(PORT, () => console.log(`API running at http://localhost:${PORT}`));
