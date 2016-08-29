/*
 * {{{ header & license
 * Copyright (c) 2006 Wisconsin Court System
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 * }}}
 */
package br.gov.mec.aghu.core.saucer;

import org.xhtmlrenderer.render.FSFont;

import br.gov.mec.aghu.core.saucer.AGHUITextFontResolver.FontDescription;

public class AGHUITextFSFont implements FSFont {
    private FontDescription _font;
    private float _size;
    
    public AGHUITextFSFont(FontDescription font, float size) {
        _font = font;
        _size = size;
    }

    public float getSize2D() {
        return _size;
    }
    
    public FontDescription getFontDescription() {
        return _font;
    }
}
