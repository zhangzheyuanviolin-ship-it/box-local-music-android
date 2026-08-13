            package p000;

            import com.google.android.datatransport.cct.CctBackendFactory;
            import java.util.HashMap;
            
            public final class O1lOoiIIliiI {
                public IIlio101Io I00000oIO;
                public IOO000ilo I00000oOI;
                public HashMap I0000Il00O;

                public final synchronized OoIOiIl10ioo I00000oIO(String str) {
/* 8 */             if (this.I0000Il00O.containsKey(str)) {
/* 16 */                return (OoIOiIl10ioo) this.I0000Il00O.get(str);
                    }
/* 24 */            CctBackendFactory cctBackendFactoryI00o101lO = this.I00000oIO.I00o101lO(str);
/* 28 */            if (cctBackendFactoryI00o101lO == null) {
/* 31 */                return null;
                    }
/* 39 */            OoIOiIl10ioo ooIOiIl10iooCreate = cctBackendFactoryI00o101lO.create(this.I00000oOI.I000o00OoI0I(str));
/* 45 */            this.I0000Il00O.put(str, ooIOiIl10iooCreate);
/* 49 */            return ooIOiIl10iooCreate;
                }
            }
