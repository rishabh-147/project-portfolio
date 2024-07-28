package com.rishabh.main.repo;

import java.util.List;

import com.rishabh.main.domain.Certification;

public interface CertificationRepoInterface {
	public List<Certification> getAll(int userId);
	public Certification getCertificateById(int certificateId);
}
