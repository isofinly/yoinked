import json,requests
s = requests.post("https://vrit.me/data.php",data={
    "method": "audio.get",
    "count": 1000000000,
    "offset": 0,
    "user_id":-52922518})
s = json.loads(s.text)
f = open("music.txt", "w")
f.write(s)
f.close