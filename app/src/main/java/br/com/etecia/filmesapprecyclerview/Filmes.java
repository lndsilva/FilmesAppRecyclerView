package br.com.etecia.filmesapprecyclerview;

public class Filmes {
    private String titulo;
    private String descricao;
    private String categoria;
    private int img;

    public Filmes(String titulo, String descricao, String categoria, int img) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
