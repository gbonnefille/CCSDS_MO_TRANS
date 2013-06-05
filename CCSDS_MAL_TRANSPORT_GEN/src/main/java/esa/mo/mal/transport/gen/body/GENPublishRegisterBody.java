/* ----------------------------------------------------------------------------
 * Copyright (C) 2013      European Space Agency
 *                         European Space Operations Centre
 *                         Darmstadt
 *                         Germany
 * ----------------------------------------------------------------------------
 * System                : CCSDS MO Generic Transport Framework
 * ----------------------------------------------------------------------------
 * Licensed under the European Space Agency Public License, Version 2.0
 * You may not use this file except in compliance with the License.
 *
 * Except as expressly set forth in this License, the Software is provided to
 * You on an "as is" basis and without warranties of any kind, including without
 * limitation merchantability, fitness for a particular purpose, absence of
 * defects or errors, accuracy or non-infringement of intellectual property rights.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * ----------------------------------------------------------------------------
 */
package esa.mo.mal.transport.gen.body;

import org.ccsds.moims.mo.mal.MALException;
import org.ccsds.moims.mo.mal.encoding.MALElementInputStream;
import org.ccsds.moims.mo.mal.encoding.MALElementStreamFactory;
import org.ccsds.moims.mo.mal.structures.EntityKeyList;
import org.ccsds.moims.mo.mal.transport.MALPublishRegisterBody;

/**
 * Implementation of the MALPublishRegisterBody interface.
 */
public class GENPublishRegisterBody extends GENMessageBody implements MALPublishRegisterBody
{
  private static final long serialVersionUID = 222222222222228L;
  /**
   * Constructor.
   *
   * @param messageParts The message parts that compose the body.
   */
  public GENPublishRegisterBody(final Object[] messageParts)
  {
    super(messageParts);
  }

  /**
   * Constructor.
   *
   * @param wrappedBodyParts True if the encoded body parts are wrapped in BLOBs.
   * @param count The number of message parts.
   * @param encFactory The encoder stream factory to use.
   * @param encBodyElements The input stream that holds the encoded body parts.
   */
  public GENPublishRegisterBody(final boolean wrappedBodyParts,
          final int count,
          final MALElementStreamFactory encFactory,
          final MALElementInputStream encBodyElements)
  {
    super(wrappedBodyParts, count, encFactory, encBodyElements);
  }

  @Override
  public EntityKeyList getEntityKeyList() throws MALException
  {
    return (EntityKeyList) getBodyElement(0, new EntityKeyList());
  }
}
