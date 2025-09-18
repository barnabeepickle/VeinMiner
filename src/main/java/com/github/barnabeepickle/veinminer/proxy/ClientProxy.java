/* This file is part of VeinMiner.
 *
 *    VeinMiner is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as
 *    published by the Free Software Foundation, either version 3 of
 *     the License, or (at your option) any later version.
 *
 *    VeinMiner is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with VeinMiner.
 *    If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.barnabeepickle.veinminer.proxy;

import net.minecraftforge.client.ClientCommandHandler;
import com.github.barnabeepickle.veinminer.client.ClientCommand;
import com.github.barnabeepickle.veinminer.event.client.ActivateMinerKeybindManager;

/**
 * Client side implementation of proxy interface.
 */

@SuppressWarnings("UnusedDeclaration")
public class ClientProxy extends CommonProxy {
    private ActivateMinerKeybindManager keybindManager;
    private ClientCommand clientCommand;

    @Override
    public void registerClientEvents() {
        keybindManager = new ActivateMinerKeybindManager();
    }

    @Override
    public void resetKeybindPacketCount() {
        keybindManager.resetCount();
    }

    @Override
    public void registerPostinitCommands() {
        clientCommand = new ClientCommand();
        ClientCommandHandler.instance.registerCommand(clientCommand);
    }
}
