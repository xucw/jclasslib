/*
 This library is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public
 License as published by the Free Software Foundation; either
 version 2 of the license, or (at your option) any later version.
 */

package org.gjt.jclasslib.browser.detail

import org.gjt.jclasslib.browser.AbstractDetailPane
import org.gjt.jclasslib.browser.BrowserServices

import javax.swing.tree.TreePath

class EmptyDetailPane(services: BrowserServices) : AbstractDetailPane(services) {

    override fun show(treePath: TreePath) {
    }

    override fun setupComponent() {
    }
}
