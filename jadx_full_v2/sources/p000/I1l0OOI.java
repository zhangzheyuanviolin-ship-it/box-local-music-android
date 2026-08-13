            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1l0OOI {
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public String I0000O;

                public iiO01011O I00000oIO() {
                    String str;
                    String str2;
                    String str3;
/* 1 */             String str4 = this.I00000oIO;
/* 3 */             if (str4 != null && (str = this.I00000oOI) != null && (str2 = this.I0000Il00O) != null && (str3 = this.I0000O) != null) {
/* 20 */                iiO01011O iio01011o = new iiO01011O();
/* 23 */                iio01011o.I00000oIO = str4;
/* 25 */                iio01011o.I00000oOI = str;
/* 27 */                iio01011o.I0000Il00O = str2;
/* 29 */                iio01011o.I0000O = str3;
/* 31 */                VarHandle.storeStoreFence();
/* 34 */                return iio01011o;
                    }
/* 37 */            StringBuilder sb = new StringBuilder();
/* 42 */            if (this.I00000oIO == null) {
/* 46 */                sb.append(" androidSdkVersion");
                    }
/* 51 */            if (this.I00000oOI == null) {
/* 55 */                sb.append(" model");
                    }
/* 60 */            if (this.I0000Il00O == null) {
/* 64 */                sb.append(" device");
                    }
/* 69 */            if (this.I0000O == null) {
/* 73 */                sb.append(" manufacturer");
                    }
/* 86 */            I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 89 */            return null;
                }
            }
