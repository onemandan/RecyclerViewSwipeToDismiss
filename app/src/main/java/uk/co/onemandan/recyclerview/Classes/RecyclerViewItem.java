package uk.co.onemandan.recyclerview.Classes;

public class RecyclerViewItem {
    private String _title, _subtitle;

    public RecyclerViewItem(String title, String subtitle){
        _title = title;
        _subtitle = subtitle;
    }

    public String GetTitle(){
        return _title;
    }

    public String GetSubtitle(){
        return _subtitle;
    }
}
