//5.what is axios and fetch how to differntiate those?

// fetch('https://api-crud-1-g7uq.onrender.com/api/users')
//   .then(res => res.json())
//   .then(data => console.log(data))
//   .catch(err => console.error('Error:', err));

const axios = require('axios');
axios.get('https://api-crud-1-g7uq.onrender.com/api/users')
  .then(response => {
    console.log(response.data); // This will print the list of users
  })
  .catch(error => {
    console.error('Error:', error.message); // Handles any errors
  });






