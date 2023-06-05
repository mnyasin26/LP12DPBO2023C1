/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.GameObject;
import java.awt.Color;
import java.awt.Graphics;

public class Target extends GameObject
{
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Target()
    {
        super(0, 0,"Target");
        super.setHeight(20);
    }
    
    // Constructor with target position.
    public Target(int x, int y)
    {
        super(x, y, "Target");
        super.setHeight(20);
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set target shape.
        object.setColor(Color.decode("#fae9eb"));
        object.fillRect(x, y, 30, 30);
    }
}
