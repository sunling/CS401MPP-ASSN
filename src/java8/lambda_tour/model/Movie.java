/*
 * Copyright (C) 2014 José Paumard
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package java8.lambda_tour.model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author José
 */
public class Movie {
    private String title ;
    private int releaseYear ;
    private Set<Actor> actors = new HashSet<>() ;
    
    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
    
    public String title() {
        return this.title ;
    }
    
    public int releaseYear() {
        return this.releaseYear ;
    }
    
    public void addActor(Actor actor) {
        this.actors.add(actor) ;
    }
    
    public Set<Actor> actors() {
        return this.actors ;
    }
    
    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", releaseYear=" + releaseYear + ", actors=" + actors + '}';
    }
}
