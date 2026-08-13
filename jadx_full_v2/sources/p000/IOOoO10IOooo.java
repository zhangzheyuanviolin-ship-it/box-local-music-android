            package p000;

            import java.io.Serializable;
            
            public final class IOOoO10IOooo implements Ii00l101O, Serializable {
                public final Ii00l101O I00iOIl;
                public final Ii00ilI1 I00iiI;

                public IOOoO10IOooo(Ii00l101O ii00l101O, Ii00ilI1 ii00ilI1) {
/* 4 */             this.I00iOIl = ii00l101O;
/* 6 */             this.I00iiI = ii00ilI1;
                }

                @Override
                public final Object I00IoiI(IlliIl1l11O illiIl1l11O, Object obj) {
/* 9 */             return illiIl1l11O.invoke(this.I00iOIl.I00IoiI(illiIl1l11O, obj), this.I00iiI);
                }

                @Override
                public final Ii00l101O I00OIl(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             Ii00ilI1 ii00ilI1 = this.I00iiI;
/* 3 */             Ii00ilI1 ii00ilI1I00lli11 = ii00ilI1.I00lli11(ii00l0i1loO);
/* 7 */             Ii00l101O ii00l101O = this.I00iOIl;
/* 9 */             if (ii00ilI1I00lli11 != null) {
/* 11 */                return ii00l101O;
                    }
/* 12 */            Ii00l101O ii00l101OI00OIl = ii00l101O.I00OIl(ii00l0i1loO);
                    return ii00l101OI00OIl == ii00l101O ? this : ii00l101OI00OIl == Il00o11.I00iOIl ? ii00ilI1 : new IOOoO10IOooo(ii00l101OI00OIl, ii00ilI1);
                }

                @Override
                public final Ii00l101O I00ioIO(Ii00l101O ii00l101O) {
/* 1 */             return iiollilo0IO1.I00000oIO(this, ii00l101O);
                }

                @Override
                public final Ii00ilI1 I00lli11(Ii00l0i1loO ii00l0i1loO) {
                    while (true) {
/* 3 */                 Ii00ilI1 ii00ilI1I00lli11 = this.I00iiI.I00lli11(ii00l0i1loO);
/* 7 */                 if (ii00ilI1I00lli11 != null) {
/* 9 */                     return ii00ilI1I00lli11;
                        }
/* 10 */                Ii00l101O ii00l101O = this.I00iOIl;
/* 14 */                if (!(ii00l101O instanceof IOOoO10IOooo)) {
/* 19 */                    return ii00l101O.I00lli11(ii00l0i1loO);
                        }
/* 16 */                this = (IOOoO10IOooo) ii00l101O;
                    }
                }

                public final boolean equals(Object obj) {
                    boolean zI0000O;
/* 1 */             if (this == obj) {
/* 92 */                return true;
                    }
/* 6 */             if (obj instanceof IOOoO10IOooo) {
/* 8 */                 IOOoO10IOooo iOOoO10IOooo = (IOOoO10IOooo) obj;
/* 10 */                int i = 2;
/* 11 */                IOOoO10IOooo iOOoO10IOooo2 = iOOoO10IOooo;
/* 12 */                int i2 = 2;
                        while (true) {
/* 13 */                    Ii00l101O ii00l101O = iOOoO10IOooo2.I00iOIl;
/* 23 */                    iOOoO10IOooo2 = ii00l101O instanceof IOOoO10IOooo ? (IOOoO10IOooo) ii00l101O : null;
/* 24 */                    if (iOOoO10IOooo2 == null) {
                                break;
                            }
/* 88 */                    i2++;
                        }
/* 26 */                IOOoO10IOooo iOOoO10IOooo3 = this;
                        while (true) {
/* 27 */                    Ii00l101O ii00l101O2 = iOOoO10IOooo3.I00iOIl;
/* 36 */                    iOOoO10IOooo3 = ii00l101O2 instanceof IOOoO10IOooo ? (IOOoO10IOooo) ii00l101O2 : null;
/* 37 */                    if (iOOoO10IOooo3 == null) {
                                break;
                            }
/* 85 */                    i++;
                        }
/* 39 */                if (i2 == i) {
                            while (true) {
/* 41 */                        Ii00ilI1 ii00ilI1 = this.I00iiI;
/* 55 */                        if (!O0000Ioio00.I0000O(iOOoO10IOooo.I00lli11(ii00ilI1.getKey()), ii00ilI1)) {
/* 57 */                            zI0000O = false;
                                    break;
                                }
/* 59 */                        Ii00l101O ii00l101O3 = this.I00iOIl;
/* 63 */                        if (!(ii00l101O3 instanceof IOOoO10IOooo)) {
/* 68 */                            Ii00ilI1 ii00ilI12 = (Ii00ilI1) ii00l101O3;
/* 78 */                            zI0000O = O0000Ioio00.I0000O(iOOoO10IOooo.I00lli11(ii00ilI12.getKey()), ii00ilI12);
                                    break;
                                }
/* 65 */                        this = (IOOoO10IOooo) ii00l101O3;
                            }
/* 82 */                    if (zI0000O) {
/* 92 */                        return true;
                            }
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 13 */            return this.I00iiI.hashCode() + this.I00iOIl.hashCode();
                }

                public final String toString() {
/* 25 */            return IlIi0I0.I000oI1ioi(new StringBuilder("["), (String) I00IoiI(new I000OiO(12), ""), ']');
                }
            }
