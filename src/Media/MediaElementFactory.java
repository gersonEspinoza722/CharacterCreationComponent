/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Media;

import BoardElement.Character.IFactoryCreationComponent;
import Media.Concrete.Image;

/**
 *
 * @author Marvin Armando
 */
public class MediaElementFactory implements IFactoryCreationComponent {
    public static final int IMAGEN = 0;
    public static final int VIDEO = 1;
    public static final int GIFT = 2;

    public IMediaElement getMedia(int mediaType){
        switch (mediaType){
                case IMAGEN:
                    return new Image();
                case VIDEO:
                    return  null;
                case GIFT:
                    return  null;
        }
        return null;
    }
    
}
