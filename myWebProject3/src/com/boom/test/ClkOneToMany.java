package com.boom.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import com.boom.entity.Customer;
import com.boom.entity.LinkMan;
import com.boom.utils.HibernateUtils;

public class ClkOneToMany {

	// һ�Զ�Ĺ�ϵ �����ӵķ�����
	@Test
	public void testOneToManyAdd1() {
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction tx=null;
		try {
			sessionFactory=HibernateUtils.getSessionFactory();
			session=HibernateUtils.getSessionObject();
			tx=session.beginTransaction();
			//����һ
			Customer customer=new Customer();
			customer.setCustLevel("VIP");
			customer.setCustName("baidu");
			customer.setCustMobile("110");
			customer.setCustPhone("110");
			customer.setCustSourse("intnet");
		
			//���ö�
			LinkMan linkMan=new LinkMan();
			linkMan.setLkm_gender("111");
			linkMan.setLkm_name("xiao");
			linkMan.setLkm_phone("999");
			//�������
			customer.getLinkMen().add(linkMan);
			linkMan.setCustomer(customer);
			//������ݵ����ݿ�
			session.save(customer);
			session.save(linkMan);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally{
			if (session!=null) {
				session.close();	
			}
			if (sessionFactory!=null) {
				sessionFactory.close();
			}
		}
	}

	// һ�Զ�Ĺ�ϵ ���򻯵ķ�����
	@Test
	public void testOneToManyAdd2() {
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction tx=null;
		try {
			sessionFactory=HibernateUtils.getSessionFactory();
			session=HibernateUtils.getSessionObject();
			tx=session.beginTransaction();
			//����һ
			Customer customer=new Customer();
			customer.setCustLevel("VIP");
			customer.setCustName("ck");
			customer.setCustMobile("120");
			customer.setCustPhone("120");
			customer.setCustSourse("cknet");
		
			//���ö�
			LinkMan linkMan=new LinkMan();
			linkMan.setLkm_gender("222");
			linkMan.setLkm_name("san");
			linkMan.setLkm_phone("999");
			//�������
			customer.getLinkMen().add(linkMan);
			linkMan.setCustomer(customer);
			//������ݵ����ݿ�
			session.save(customer);

			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally{
			if (session!=null) {
				session.close();	
			}
			if (sessionFactory!=null) {
				sessionFactory.close();
			}

		}
	}

}
