//    SmartPos - Smart Touch Point of Sale
//    Copyright (c) 2017 Alejandro Camargo & previous Openbravo POS works
//    https://unicenta.com
//
//    This file is part of uniCenta oPOS
//
//    uniCenta oPOS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   uniCenta oPOS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with uniCenta oPOS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.printer;

/**
 *
 * @author JG uniCenta
 */
public class TicketPrinterException extends java.lang.Exception {

    /**
     *
     */
    public TicketPrinterException() {
    }

    /**
     *
     * @param msg
     */
    public TicketPrinterException(String msg) {
        super(msg);
    }

    /**
     *
     * @param msg
     * @param cause
     */
    public TicketPrinterException(String msg, Throwable cause) {
        super(msg, cause);
    }
}


