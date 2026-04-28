abstract class Dialog{
     abstract Button createButton();
     public void renderUI(){
        Button btn=new Button();
        btn.render();
     }
}