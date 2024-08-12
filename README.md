# Reversi (My Edition)

## How to Play

Reversi is a two-player game. Each player selects a color (Black or White) and takes turns. Player White goes first. If you place your disc(s) next to the opponent's disc(s), those discs will be flipped to your color. For example, if your color is white and you place a disc next to black discs, the adjacent black discs will turn white.

### Scenarios

1. **Start of Game**  
   ![Start of Game](https://private-user-images.githubusercontent.com/97638014/354347292-120bb9be-85cc-4481-b683-dfb22d6369d3.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjM0NzIyODcsIm5iZiI6MTcyMzQ3MTk4NywicGF0aCI6Ii85NzYzODAxNC8zNTQzNDcyOTItMTIwYmI5YmUtODVjYy00NDgxLWI2ODMtZGZiMjJkNjM2OWQzLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MTIlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODEyVDE0MTMwN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTk0YjY5MDg1N2NkODhlMzBjNmIzODg1M2I0ZGExZDllZTJjYzU5NDg5ZjQzZjYxMDdmZDkyMDYyYmVlMjYwZWImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.8zkqhOmiMSW7WHm3wlQqJN9vWHSQ5z-jZZMVdjEFIVA)

2. **White's First Move**  
   White has flipped one black disc to white.  
   ![White Move](https://private-user-images.githubusercontent.com/97638014/354347305-b0f0b3eb-17ef-4742-bbc8-f3536e2d90c2.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjM0NzIyODcsIm5iZiI6MTcyMzQ3MTk4NywicGF0aCI6Ii85NzYzODAxNC8zNTQzNDczMDUtYjBmMGIzZWItMTdlZi00NzQyLWJiYzgtZjM1MzZlMmQ5MGMyLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MTIlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODEyVDE0MTMwN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTdiYTZlMDMzZTA0OWE5ODgyYmU3M2JhMWMzOWRlMWE0ZjQzNGIwMTkyNGUwMWMzNjViMzU5Y2ViOGYyY2FjYWImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.HXAiJGg0P4C-nWLHUVO9PWI6bmQQYROUKYMRp36T4I0)

## How to Win

The game continues until all 64 squares on the board are filled with discs. The player with the most discs of their color at the end of the game wins. For instance, if Black has 34 discs out of 64, Black wins.

### Winning Example

1. **Black Wins**  
   Black has a total of 34 discs.  
   ![Black Wins](https://private-user-images.githubusercontent.com/97638014/354347314-ba552280-edab-4613-98a5-f67b590bd01f.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI1Mzk0NDEsIm5iZiI6MTcyMjUzOTE0MSwicGF0aCI6Ii85NzYzODAxNC8zNTQzNDczMTQtYmE1NTIyODAtZWRhYi00NjEzLTk4YTUtZjY3YjU5MGJkMDFmLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODAxVDE5MDU0MVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWU5ODFlYjM1ZjQ1NjgzNWYxZGVhNGJhYzE1MGEzOGMyMzMwMDIyOTA0MjlmZmQ2M2IyYzVlYzM1MDA5YzlhMTkmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.XJfHNFiSOvxxBB8GUH54nWHHKUolmVos-pCa6DXPla8)

## Customizations

- **AI Mode**: Players can click the AI button to let the computer make the next move. This is useful for playing against the computer.  
   ![AI Mode](https://private-user-images.githubusercontent.com/97638014/354347321-48201858-1ea9-400d-a26d-3038c29fcaca.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI1Mzk0NDEsIm5iZiI6MTcyMjUzOTE0MSwicGF0aCI6Ii85NzYzODAxNC8zNTQzNDczMjEtNDgyMDE4NTgtMWVhOS00MDBkLWEyNmQtMzAzOGMyOWZjYWNhLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODAxVDE5MDU0MVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTMwNjQyZmJmZjRlZmYwZTk4MzUwM2EzNzM2ZWVhMjEzN2IxZTU4OTllNzYzZTlkNzhiZmVkZmIwZjU1YjVlZWMmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.xF5LQhe3zQ0Ajr4QSb-EKbtAdBhuw3BMGfb9mwsuzB8)

- **Turn Indicator**: The current player's turn is displayed on the screen.  
   ![Turn Indicator](https://private-user-images.githubusercontent.com/97638014/354347324-20ddd215-4e67-48e4-aa69-5211915bffe6.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI1Mzk0NDEsIm5iZiI6MTcyMjUzOTE0MSwicGF0aCI6Ii85NzYzODAxNC8zNTQzNDczMjQtMjBkZGQyMTUtNGU2Ny00OGU0LWFhNjktNTIxMTkxNWJmZmU2LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODAxVDE5MDU0MVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWFlM2YxZDJkYjYxNzk5MzRiMjA3Mzc2YTIyNDk5YjIwNWE0MTNkMGUzY2EyNzAzYzI0ZjUyNzUxNmE1ZWU0NjEmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.5HJJ-jIg-5DGYrPhJlKiM2JvcctAP7IPrQTe7pLaXrg)

- **Reset Board**: After the game ends, click the 'OK' button to reset the board.  
   ![Reset Board](https://private-user-images.githubusercontent.com/97638014/354347327-326324c9-6246-4401-8884-2c04a34fac13.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI1Mzk0NDEsIm5iZiI6MTcyMjUzOTE0MSwicGF0aCI6Ii85NzYzODAxNC8zNTQzNDczMjctMzI2MzI0YzktNjI0Ni00NDAxLTg4ODQtMmMwNGEzNGZhYzEzLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODAxVDE5MDU0MVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTU4MGIzMWM3ZDY1NWQ0MjVjNTU0MzZiZDhmYWZmODFiNjRiNzBiNTQxNzUyNDI5Yzk4ZTU4MTE4OThmNjcwMGYmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.tVpycJVDnKk8mU69tzvW8AhWrROd2stvVUdbnwlJfEA)

- **Close Game**: Click the ‘X’ to close the game from either side (Black or White).  
   ![Close Game](https://private-user-images.githubusercontent.com/97638014/354347329-cdb211b9-30c9-42c2-baeb-0d2f66a656ef.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjI1Mzk0NDEsIm5iZiI6MTcyMjUzOTE0MSwicGF0aCI6Ii85NzYzODAxNC8zNTQzNDczMjktY2RiMjExYjktMzBjOS00MmMyLWJhZWItMGQyZjY2YTY1NmVmLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODAxVDE5MDU0MVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWE3ZmMzZDVmZWVlMWU5NDNkMmU4NzZmYTI0OTI0MjdiNDY1ZWMyMGRlM2QyNzU4ZWM2Y2NhNTAyYWVhMTZkZTkmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.tGDWv_YuOBKESqioeSHCD4xAzj1kHXMTZuFxOrloPm0)
