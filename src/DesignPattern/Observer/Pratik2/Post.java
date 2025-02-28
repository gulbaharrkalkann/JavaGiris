package DesignPattern.Observer.Pratik2;

public class Post {

        private String baslik;
        private String icerik;
        private TakipEdilen takipEdilen;

        public Post(String baslik,String icerik,TakipEdilen takipEdilen) {
       setBaslik(baslik);
       setIcerik(icerik);
       setTakipEdilen(takipEdilen);


        }

        public String getBaslik() {
            return baslik;
        }

        public void setBaslik(String baslik) {
            this.baslik = baslik;
        }

        public String getIcerik() {
            return icerik;
        }

        public void setIcerik(String icerik) {
            this.icerik = icerik;
        }

        public TakipEdilen getTakipEdilen() {
            return takipEdilen;
        }

        public void setTakipEdilen(TakipEdilen takipEdilen) {
            this.takipEdilen = takipEdilen;
        }
    }

