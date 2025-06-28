//const API_URL = "https://api-crud-1-g7uq.onrender.com/api/users";

// ✅ Fetch users using built-in fetch (Node v18+)
// const getUsers = async () => {
//   try {
//     const res = await fetch(API_URL);
//     if (!res.ok) throw new Error("Failed to fetch data");

//     const users = await res.json();
//     console.log("Fetched Users:");
//     console.log(users);
//   } catch (err) {
//     console.error("Error:", err.message);
//   }
// };getUsers();
const usersToAdd = [
  { name: "vijay", email: "vijay@gmail.com", age: 25, city: "Hyderabad", role: "Developer" },
  { name: "Kiran", email: "kiran@gmail.com", age: 27, city: "Bangalore", role: "Tester" },
  { name: "Sneha", email: "sneha@gmail.com", age: 24, city: "Chennai", role: "Designer" },
  { name: "Ravi", email: "ravi@gmail.com", age: 28, city: "Mumbai", role: "Manager" },
  { name: "Pooja", email: "pooja@gmail.com", age: 26, city: "Delhi", role: "Analyst" },
  { name: "Vikram", email: "vikram@gmail.com", age: 31, city: "Pune", role: "DevOps" },
  { name: "Neha", email: "neha@gmail.com", age: 22, city: "Kolkata", role: "Intern" },
  { name: "Arjun", email: "arjun@gmail.com", age: 29, city: "Ahmedabad", role: "Engineer" },
  { name: "Divya", email: "divya@gmail.com", age: 23, city: "Noida", role: "HR" },
  { name: "Manish", email: "manish@gmail.com", age: 30, city: "Jaipur", role: "Team Lead" }
];

const API_URL = "https://api-crud-1-g7uq.onrender.com/api/users";

const addUsers = async () => {
  for (let user of usersToAdd) {
    try {
      const res = await fetch(API_URL, {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
      });

      if (!res.ok) {
        const err = await res.text();
        console.error(`❌ Failed to add ${user.name}:`, err);
      } else {
        const added = await res.json();
        console.log(`✅ Added: ${added.name}`);
      }
    } catch (err) {
      console.error(`❌ Error adding ${user.name}:`, err.message);
    }
  }

  console.log("🎉 All users added successfully!");
};

addUsers();


