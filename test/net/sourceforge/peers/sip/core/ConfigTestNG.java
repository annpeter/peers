/*
    This file is part of Peers.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    
    Copyright 2007, 2008 Yohann Martineau 
*/

package net.sourceforge.peers.sip.core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.dom4j.DocumentException;
import org.testng.annotations.Test;

public class ConfigTestNG {

    @Test
    public void testConfig() throws MalformedURLException, DocumentException {
        String urlStr =
            "file:" + new File("conf/peers.xml").getAbsolutePath();
        URL url = new URL(urlStr);
        Config config = new Config(url);
        List<?> list = config.selectNodes("//peers:profile");
        assert list != null : "no node found for xpath: //peers:profile";
    }

}
