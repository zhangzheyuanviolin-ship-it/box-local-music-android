            package p000;

            import android.net.Uri;
            
            public final class loOliOIioIo {
                public Uri I00000oIO;
                public lOoo0oiii I00000oOI;
                public OOI1o1oII0 I0000Il00O;
                public IoillO0OOoo I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof loOliOIioIo)) {
/* 52 */                return false;
                    }
/* 9 */             loOliOIioIo loolioiioio = (loOliOIioIo) obj;
                    return this.I00000oIO.equals(loolioiioio.I00000oIO) && this.I00000oOI.equals(loolioiioio.I00000oOI) && this.I0000Il00O.equals(loolioiioio.I0000Il00O) && this.I0000O.equals(loolioiioio.I0000O);
                }

                public final int hashCode() {
/* 26 */            int iHashCode = ((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O.hashCode();
/* 47 */            return ((((((this.I0000O.hashCode() ^ (iHashCode * 1000003)) * 1000003) ^ iOl0lOIi11.I00l0OO0IO.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 7 */             int length = string.length();
/* 13 */            String string2 = this.I00000oOI.toString();
/* 17 */            int length2 = string2.length();
/* 21 */            iOl0lOIi11 iol0loii11 = iOl0lOIi11.I00l0OO0IO;
/* 23 */            IoillO0OOoo ioillO0OOoo = this.I0000O;
/* 27 */            String strValueOf = String.valueOf(this.I0000Il00O);
/* 31 */            String strValueOf2 = String.valueOf(ioillO0OOoo);
/* 35 */            String string3 = iol0loii11.toString();
/* 39 */            int length3 = strValueOf.length();
/* 43 */            int length4 = strValueOf2.length();
/* 79 */            StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + string3.length() + 32 + String.valueOf(true).length() + 22);
/* 86 */            IIl001iO0Io.I001lIiIIo1O(sb, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
/* 93 */            IIl001iO0Io.I001lIiIIo1O(sb, ", handler=", strValueOf, ", migrations=", strValueOf2);
/* 100 */           return IIlIOloOOO.I0010I0i(sb, ", variantConfig=", string3, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
                }
            }
