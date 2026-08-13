            package p000;
            
            public abstract class I011olOoO implements IiIiOl1l0oI, IlOIioiOooOO, Ol0O1I, OoOI11, O0O01O0o {
                public final OOoOiOo01lo I00iOIl;

                public I011olOoO(IllOOo00lI illOOo00lI) {
/* 6 */             OOoOiOo01lo oOoOiOo01loI00000oIO = null;
/* 13 */            OOoOiOo01lo oOoOiOo01lo = illOOo00lI instanceof OOoOiOo01lo ? (OOoOiOo01lo) illOOo00lI : null;
/* 14 */            if (oOoOiOo01lo != null) {
/* 23 */                oOoOiOo01loI00000oIO = oOoOiOo01lo;
                    } else if (illOOo00lI != null) {
/* 18 */                oOoOiOo01loI00000oIO = lIlo0Oi0oOI.I00000oIO(null, illOOo00lI);
                    }
/* 24 */            this.I00iOIl = oOoOiOo01loI00000oIO;
                }

                public abstract O0O01O0o I00000oIO();

                public abstract O0IOli0o0 I0000O();

                public abstract boolean I000l1();

                public abstract boolean I00100o1O0lo();

                public abstract boolean I0010I0i();

                public abstract boolean I001IO000();

                public abstract I011olOoO I001l0I00();

                public abstract I011olOoO I001lIiIIo1O(boolean z);

                public abstract I011olOoO I001lllioOl(boolean z);

                public abstract I011olOoO I001lloI();

                public boolean equals(Object obj) {
                    return (obj instanceof I011olOoO) && iOI0lOI1.I00000oOI(Iioi0lilII.I00ilO0, this, (O0iIo0i1) obj);
                }

                public int hashCode() {
/* 1 */             O0IiIl0il o0IiIl0ilI001IIilI0O = I001IIilI0O();
/* 12 */            int iHashCode = o0IiIl0ilI001IIilI0O != null ? o0IiIl0ilI001IIilI0O.hashCode() : 0;
/* 34 */            return Boolean.hashCode(I000lI()) + ((I00111O().hashCode() + (iHashCode * 31)) * 31);
                }

                public String toString() {
/* 2 */             return Io1Oioii1111.I000lI(this, false);
                }
            }
