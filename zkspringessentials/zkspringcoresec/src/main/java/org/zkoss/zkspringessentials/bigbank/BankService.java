package org.zkoss.zkspringessentials.bigbank;

import org.springframework.security.access.prepost.PreAuthorize;

public interface BankService {

    public Account readAccount(Long id);

    public Account[] findAccounts();

    @PreAuthorize("hasRole('ROLE_SUPERVISOR') or hasRole('ROLE_TELLER')" )
    public Account post(Account account, double amount);
}
