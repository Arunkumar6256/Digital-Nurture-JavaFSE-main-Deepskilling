import officeImage from "./office.jpg";

function App() {

  const office = {
    name: "Smart Business Center",
    rent: 55000,
    address: "Hitech City, Hyderabad"
  };

  const officeSpaces = [
    {
      id: 1,
      name: "Smart Business Center",
      rent: 55000,
      address: "Hitech City, Hyderabad"
    },
    {
      id: 2,
      name: "Tech Park",
      rent: 75000,
      address: "Madhapur, Hyderabad"
    },
    {
      id: 3,
      name: "Corporate Hub",
      rent: 60000,
      address: "Gachibowli, Hyderabad"
    },
    {
      id: 4,
      name: "Cyber Towers",
      rent: 85000,
      address: "Financial District, Hyderabad"
    }
  ];

  return (
    <div style={{ textAlign: "center" }}>

      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office Space"
        width="400"
        height="250"
      />

      <h2>Single Office Details</h2>

      <h3>Name : {office.name}</h3>

      <h3
        style={{
          color: office.rent < 60000 ? "red" : "green"
        }}
      >
        Rent : ₹{office.rent}
      </h3>

      <h3>Address : {office.address}</h3>

      <hr />

      <h2>Available Office Spaces</h2>

      {
        officeSpaces.map((item) => (

          <div
            key={item.id}
            style={{
              border: "1px solid gray",
              margin: "15px",
              padding: "15px"
            }}
          >

            <h3>Name : {item.name}</h3>

            <h3
              style={{
                color: item.rent < 60000 ? "red" : "green"
              }}
            >
              Rent : ₹{item.rent}
            </h3>

            <h3>Address : {item.address}</h3>

          </div>

        ))
      }

    </div>
  );
}

export default App;