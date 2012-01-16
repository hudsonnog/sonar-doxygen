/*
 * Sonar DOXYGEN Plugin.
 * Copyright (C) 2009 SonarSource
 * dev@sonar.codehaus.org
 *
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

package org.sonar.plugins.doxygen;

import org.sonar.api.resources.Java;
import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.NavigationSection;
import org.sonar.api.web.ResourceLanguage;
import org.sonar.api.web.RubyRailsPage;
import org.sonar.api.web.UserRole;

@ResourceLanguage(Java.KEY)
@NavigationSection({NavigationSection.RESOURCE_TAB})
@UserRole(UserRole.VIEWER)
public class DoxygenTab extends AbstractRubyTemplate implements RubyRailsPage {

    @Override
    protected String getTemplatePath() {
          
        return "/org/sonar/plugins/doxygen/documentation_page.html.erb";
    }

    public String getId() {
        return getClass().getName();
    }

    public String getTitle() {
        return "Documentation";
    }
    
}
