/*
 * Copyright (c) 1999, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.security.auth;

/**
 * This class extends {@code NTSid}
 * and represents a Windows NT user's domain SID.
 *
 * <p> An NT user only has a domain SID if in fact they are logged
 * into an NT domain.  If the user is logged into a workgroup or
 * just a standalone configuration, they will NOT have a domain SID.
 *
 * <p> Principals such as this {@code NTSidDomainPrincipal}
 * may be associated with a particular {@code Subject}
 * to augment that {@code Subject} with an additional
 * identity.  Refer to the {@code Subject} class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a {@code Subject}.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
public class NTSidDomainPrincipal extends NTSid {

    private static final long serialVersionUID = 5247810785821650912L;

    /**
     * Create an {@code NTSidDomainPrincipal} with a Windows NT SID.
     *
     * @param name a string version of the Windows NT SID for this
     *                  user's domain.
     *
     * @exception NullPointerException if the {@code name}
     *                  is {@code null}.
     */
    public NTSidDomainPrincipal(String name) {
        super(name);
    }

    /**
     * Return a string representation of this {@code NTSidDomainPrincipal}.
     *
     * @return a string representation of this
     *          {@code NTSidDomainPrincipal}.
     */
    public String toString() {
        java.text.MessageFormat form = new java.text.MessageFormat
                (sun.security.util.ResourcesMgr.getAuthResourceString
                        ("NTSidDomainPrincipal.name"));
        Object[] source = {getName()};
        return form.format(source);
    }

    /**
     * Compares the specified Object with this {@code NTSidDomainPrincipal}
     * for equality.  Returns true if the given object is also a
     * {@code NTSidDomainPrincipal} and the two NTSidDomainPrincipals
     * have the same SID.
     *
     * @param o Object to be compared for equality with this
     *          {@code NTSidDomainPrincipal}.
     *
     * @return true if the specified Object is equal to this
     *          {@code NTSidDomainPrincipal}.
     */
    public boolean equals(Object o) {
            if (o == null)
                return false;

        if (this == o)
            return true;

        if (!(o instanceof NTSidDomainPrincipal))
            return false;

        return super.equals(o);
    }
}