package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String texto;
    private int likes;
    private boolean destacado;
    
    
   
    public WallPostImpl() {
        this.texto = "Undefined post";  // Texto inicial
        this.likes = 0;                 // Inicia con 0 likes
        this.destacado = false;         // No está destacado por defecto
    }
    
    @Override
    public String getText(){
        return this.texto;
    }
    @Override
    public void setText(String Text){
    	 this.texto = texto;
    }
    @Override
    public int getLikes() {
    	return this.likes;
    }
    @Override
    public void like() {
    	this.likes++;
    }
    @Override
    public void dislike() {
    	if (this.likes > 0) {
			this.likes--;}
    }
    @Override
    public boolean isFeatured() {
    	return this.destacado;
    }
    @Override
    public void toggleFeatured() {
    	this.destacado = !this.destacado;
    }
    
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
