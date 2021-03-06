/*******************************************************************************
 *  |       o                                                                   |
 *  |    o     o       | HELYX-OS: The Open Source GUI for OpenFOAM             |
 *  |   o   O   o      | Copyright (C) 2012-2016 ENGYS                          |
 *  |    o     o       | http://www.engys.com                                   |
 *  |       o          |                                                        |
 *  |---------------------------------------------------------------------------|
 *  |   License                                                                 |
 *  |   This file is part of HELYX-OS.                                          |
 *  |                                                                           |
 *  |   HELYX-OS is free software; you can redistribute it and/or modify it     |
 *  |   under the terms of the GNU General Public License as published by the   |
 *  |   Free Software Foundation; either version 2 of the License, or (at your  |
 *  |   option) any later version.                                              |
 *  |                                                                           |
 *  |   HELYX-OS is distributed in the hope that it will be useful, but WITHOUT |
 *  |   ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or   |
 *  |   FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License   |
 *  |   for more details.                                                       |
 *  |                                                                           |
 *  |   You should have received a copy of the GNU General Public License       |
 *  |   along with HELYX-OS; if not, write to the Free Software Foundation,     |
 *  |   Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA            |
 *******************************************************************************/
package eu.engys.core.project.state;

import static eu.engys.util.ui.UiUtil.NONE_LABEL;

public enum SolverFamily {

    COUPLED("COUPLED", "Coupled"), SIMPLE("SIMPLE", "Simple"), PISO("PISO", "Piso"), PIMPLE("PIMPLE", "Pimple"), CENTRAL("CENTRAL", "Central"), NONE("NONE", NONE_LABEL);

    private String key;
    private String label;

    private SolverFamily(String key, String label) {
        this.key = key;
        this.label = label;
    }

    public boolean isCoupled() {
        return this == COUPLED;
    }

    public boolean isSimple() {
        return this == SIMPLE;
    }

    public boolean isPimple() {
        return this == PIMPLE;
    }

    public boolean isPiso() {
        return this == PISO;
    }

    public boolean isCentral() {
        return this == CENTRAL;
    }

    public boolean isNone() {
        return this == NONE;
    }

    public String key() {
        return key;
    }

    public String label() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}