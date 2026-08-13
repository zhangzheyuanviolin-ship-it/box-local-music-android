            package p000;

            import java.util.concurrent.CancellationException;
            
            public final class O010il extends CancellationException implements IOollIi1OO0I {
                public final transient O011OOl11 I00iOIl;

                public O010il(String str, Throwable th, O011OOl11 o011OOl11) {
/* 1 */             super(str);
/* 4 */             this.I00iOIl = o011OOl11;
/* 6 */             if (th != null) {
/* 8 */                 initCause(th);
                    }
                }

                @Override
                public final Throwable I00000oIO() {
/* 1 */             return null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 58 */                return true;
                    }
/* 5 */             if (!(obj instanceof O010il)) {
/* 56 */                return false;
                    }
/* 7 */             O010il o010il = (O010il) obj;
/* 21 */            if (!O0000Ioio00.I0000O(o010il.getMessage(), getMessage())) {
/* 56 */                return false;
                    }
/* 23 */            Object obj2 = o010il.I00iOIl;
/* 25 */            if (obj2 == null) {
/* 27 */                obj2 = OIIloillo0oO.I00iiI;
                    }
/* 29 */            Object obj3 = this.I00iOIl;
/* 31 */            if (obj3 == null) {
/* 33 */                obj3 = OIIloillo0oO.I00iiI;
                    }
                    return obj2.equals(obj3) && O0000Ioio00.I0000O(o010il.getCause(), getCause());
                }

                @Override
                public final Throwable fillInStackTrace() {
/* 4 */             setStackTrace(new StackTraceElement[0]);
/* 29 */            return this;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = getMessage().hashCode() * 31;
/* 11 */            Object obj = this.I00iOIl;
/* 13 */            if (obj == null) {
/* 15 */                obj = OIIloillo0oO.I00iiI;
                    }
/* 22 */            int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
/* 24 */            Throwable cause = getCause();
/* 36 */            return iHashCode2 + (cause != null ? cause.hashCode() : 0);
                }

                @Override
                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 15 */            sb.append("; job=");
/* 18 */            Object obj = this.I00iOIl;
/* 20 */            if (obj == null) {
/* 22 */                obj = OIIloillo0oO.I00iiI;
                    }
/* 24 */            sb.append(obj);
/* 27 */            return sb.toString();
                }
            }
