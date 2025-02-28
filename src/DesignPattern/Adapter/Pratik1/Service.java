package DesignPattern.Adapter.Pratik1;

public class Service {

        DB db;
        public Service(DB db){
            setIDB(db);
        }
        public User getUser(int ID){
            return db.selectUserById(ID);
        }
        public void addUser(User user){
            db.insertUser(user);
        }
        public DB getIdb(){
            return db; }
        public void setIDB(DB DB){
            this.db = DB;
        }
    }

