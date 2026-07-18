import React from 'react';
function ListofPlayers(){
    const players=[
        { name: "Virat", score: 95 },
        { name: "Rohit", score: 85 },
        { name: "Gill", score: 75 },
        { name: "Pant", score: 65 },
        { name: "Hardik", score: 80 },
        { name: "Jadeja", score: 68 },
        { name: "Rahul", score: 72 },
        { name: "Surya", score: 55 },
        { name: "Iyer", score: 78 },
        { name: "Bumrah", score: 45 },
        { name: "Shami", score: 60 }
    ]
    const lowScorers = players.filter(player=>player.score<70);
    return(
        <>
            <table border="1" cellPadding="10">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Score</th>
                    </tr>
                    
                </thead>
                <tbody>
                    
                        {
                            players.map((player,index)=>(
                                <tr key={index}>
                                    <td>{player.name}</td>
                                    <td>{player.score}</td>
                                </tr>
                            ))
                        }
                    
                </tbody>
            </table>
            <h2>Players with score below 70</h2>
            <ul>
                {
                    lowScorers.map((player,index)=>(
                    <li key={index}>
                        {player.name}-{player.score}
                    </li>
               ))
                }
               
            </ul>
        </>
    )
}
export default ListofPlayers;