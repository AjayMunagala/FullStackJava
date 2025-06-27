const API_URL = "https://api-crud-1-g7uq.onrender.com/api/users";

// ✅ Fetch users using built-in fetch (Node v18+)
const getUsers = async () => {
  try {
    const res = await fetch(API_URL);
    if (!res.ok) throw new Error("Failed to fetch data");

    const users = await res.json();
    console.log("Fetched Users:");
    console.log(users);
  } catch (err) {
    console.error("Error:", err.message);
  }
};

getUsers();