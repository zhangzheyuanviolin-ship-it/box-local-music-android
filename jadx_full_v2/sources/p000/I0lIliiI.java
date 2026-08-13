            package p000;

            import android.os.SystemClock;
            
            public final class I0lIliiI {
                public final IOO1iloOl I00000oIO;
                public final long I00000oOI;
                public final IIlOloloOil I0000Il00O;
                public final Throwable I0000O;

                public I0lIliiI(IOO1iloOl iOO1iloOl, IIlOloloOil iIlOloloOil, Exception exc, int i) {
/* 1 */             long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 8 */             iIlOloloOil = (i & 4) != 0 ? null : iIlOloloOil;
/* 13 */            exc = (i & 8) != 0 ? null : exc;
/* 19 */            this.I00000oIO = iOO1iloOl;
/* 21 */            this.I00000oOI = jElapsedRealtimeNanos;
/* 23 */            this.I0000Il00O = iIlOloloOil;
/* 25 */            this.I0000O = exc;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 48 */                return true;
                    }
/* 6 */             if (!(obj instanceof I0lIliiI)) {
/* 50 */                return false;
                    }
/* 9 */             I0lIliiI i0lIliiI = (I0lIliiI) obj;
                    return this.I00000oIO == i0lIliiI.I00000oIO && this.I00000oOI == i0lIliiI.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, i0lIliiI.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, i0lIliiI.I0000O);
                }

                public final int hashCode() {
/* 12 */            int iI0000O = IIlIOloOOO.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31);
/* 17 */            IIlOloloOil iIlOloloOil = this.I0000Il00O;
/* 30 */            int iHashCode = (iI0000O + (iIlOloloOil == null ? 0 : Integer.hashCode(iIlOloloOil.I00000oIO))) * 31;
/* 31 */            Throwable th = this.I0000O;
/* 40 */            return iHashCode + (th != null ? th.hashCode() : 0);
                }

                public final String toString() {
/* 52 */            return "ClosingInfo(reason=" + this.I00000oIO + ", closingTimestamp=" + ((Object) Oo11iO1.I00000oIO(this.I00000oOI)) + ", errorCode=" + this.I0000Il00O + ", exception=" + this.I0000O + ')';
                }
            }
