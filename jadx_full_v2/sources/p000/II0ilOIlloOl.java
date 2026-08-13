            package p000;

            import android.os.Build;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            
            public final class II0ilOIlloOl {
                public String I00000oIO = null;
                public String I00000oOI = null;
                public String I0000Il00O = null;
                public int I0000O = 0;

                public II0ilOIlloOl I00000oIO() {
/* 8 */             if (TextUtils.isEmpty(this.I00000oIO)) {
/* 145 */               I000II.I000iOII("Title must be set and non-empty.");
/* 7 */                 return null;
                    }
/* 10 */            int i = this.I0000O;
/* 14 */            if (i != 15 && i != 255 && i != 32768 && i != 32783 && i != 33023 && i != 0) {
/* 44 */                StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
/* 49 */                sb.append(Build.VERSION.SDK_INT);
/* 54 */                sb.append(": ");
/* 57 */                int i2 = this.I0000O;
/* 88 */                sb.append(i2 != 15 ? i2 != 255 ? i2 != 32768 ? i2 != 32783 ? i2 != 33023 ? String.valueOf(i2) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
/* 98 */                throw new IllegalArgumentException(sb.toString());
                    }
/* 105 */           if (TextUtils.isEmpty(this.I0000Il00O)) {
/* 139 */               I000II.I000iOII("Negative text must be set and non-empty.");
/* 7 */                 return null;
                    }
/* 109 */           TextUtils.isEmpty(this.I0000Il00O);
/* 114 */           String str = this.I00000oIO;
/* 116 */           String str2 = this.I00000oOI;
/* 118 */           String str3 = this.I0000Il00O;
/* 120 */           int i3 = this.I0000O;
/* 122 */           II0ilOIlloOl iI0ilOIlloOl = new II0ilOIlloOl();
/* 125 */           iI0ilOIlloOl.I00000oIO = str;
/* 127 */           iI0ilOIlloOl.I00000oOI = str2;
/* 129 */           iI0ilOIlloOl.I0000Il00O = str3;
/* 131 */           iI0ilOIlloOl.I0000O = i3;
/* 133 */           VarHandle.storeStoreFence();
/* 136 */           return iI0ilOIlloOl;
                }
            }
