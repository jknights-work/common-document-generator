/*
 *   File      : DocumentDefinitionHibDAO.java
 *   Author    : cmartin
 *   Copyright : Martin Technical Consulting Limited Ltd (2018)
 *   Created   : 21-Jan-2018
 *
 *   History
 *     21-Jan-2018 cmartin The initial version.
 */
package com.willow.common.document.generator.dao.hibernate;

import com.willow.common.document.generator.dao.DocumentDefinitionDAO;
import com.willow.common.document.generator.model.DocumentDefinition;
import com.willow.common.session.service.SessionService;
import com.willow.common.eis.hibernate.AbstractHibernateDAO;
import org.hibernate.SessionFactory;

/**
 *
 * The <tt>DocumentDefinitionHibDAO</tt> class provides a concrete implementation of a DocumentDefinitionDAO.
 */
public class DocumentDefinitionHibDAO
        extends AbstractHibernateDAO<DocumentDefinition> implements DocumentDefinitionDAO {

  /**
   * Key fields.
   */
  private static final String[] FIELDS = {"businessUnitId", "documentId"};

  /**
   * Constructor as dictated by AbstractHibernateDAO.
   *
   * @param clazz the related interface class
   * @param implementationClazz the related implementation class
   * @param service a session service instance
   * @param factory a session factory instance
   */
  public DocumentDefinitionHibDAO(final Class clazz, final Class implementationClazz, final SessionService service,
          final SessionFactory factory) {
    super(clazz, implementationClazz, service, factory);
  }

  /**
   * The key fields.
   */
  /**
   * getKeyFieldNames as dictated by AbstractHibernateDao.
   *
   * @return a String Array
   */
  @Override
  public final String[] getKeyFieldNames() {
    return FIELDS.clone();
  }
}
