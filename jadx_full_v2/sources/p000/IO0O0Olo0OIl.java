            package p000;

            import java.util.List;
            
            public final class IO0O0Olo0OIl extends I011olOoO implements IO0OlIoI1oI {
                public final O0O01O0o I00iiI;
                public final IO0O0i I00iiO;
                public final boolean I00iio;

                public IO0O0Olo0OIl(O0O01O0o o0O01O0o, IO0O0i iO0O0i, boolean z) {
/* 3 */             super(IO0IoiOOOI.I00ioIO);
/* 6 */             this.I00iiI = o0O01O0o;
/* 8 */             this.I00iiO = iO0O0i;
/* 10 */            this.I00iio = z;
                }

                @Override
                public final O0O01O0o I00000oIO() {
/* 1 */             return null;
                }

                @Override
                public final O0IOli0o0 I0000O() {
/* 1 */             return null;
                }

                @Override
                public final boolean I000l1() {
/* 1 */             return false;
                }

                @Override
                public final boolean I000lI() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public final boolean I0010I0i() {
/* 1 */             return false;
                }

                @Override
                public final List I00111O() {
/* 1 */             return Il01100l.I00iOIl;
                }

                @Override
                public final O0IiIl0il I001IIilI0O() {
/* 1 */             return null;
                }

                @Override
                public final boolean I001IO000() {
/* 1 */             return false;
                }

                @Override
                public final List I001iOo1i0O() {
/* 1 */             return Il01100l.I00iOIl;
                }

                @Override
                public final I011olOoO I001l0I00() {
/* 1 */             return null;
                }

                @Override
                public final I011olOoO I001lIiIIo1O(boolean z) {
/* 1 */             if (!z) {
/* 3 */                 return this;
                    }
/* 6 */             IoOOl0iOl1io.I001IIilI0O("Definitely not null captured type is not supported yet: ", this);
/* 9 */             return null;
                }

                @Override
                public final I011olOoO I001lllioOl(boolean z) {
                    return z == this.I00iio ? this : new IO0O0Olo0OIl(this.I00iiI, this.I00iiO, z);
                }

                @Override
                public final I011olOoO I001lloI() {
/* 1 */             return null;
                }

                @Override
                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IO0O0Olo0OIl)) {
/* 32 */                return false;
                    }
/* 5 */             IO0O0Olo0OIl iO0O0Olo0OIl = (IO0O0Olo0OIl) obj;
                    return O0000Ioio00.I0000O(this.I00iiI, iO0O0Olo0OIl.I00iiI) && this.I00iiO == iO0O0Olo0OIl.I00iiO && this.I00iio == iO0O0Olo0OIl.I00iio;
                }

                @Override
                public final int hashCode() {
/* 1 */             O0O01O0o o0O01O0o = this.I00iiI;
/* 10 */            int iHashCode = o0O01O0o != null ? o0O01O0o.hashCode() : 0;
/* 28 */            return Boolean.hashCode(this.I00iio) + ((this.I00iiO.hashCode() + (iHashCode * 31)) * 31);
                }

                @Override
                public final String toString() {
/* 3 */             return this.I00iiO.toString();
                }
            }
