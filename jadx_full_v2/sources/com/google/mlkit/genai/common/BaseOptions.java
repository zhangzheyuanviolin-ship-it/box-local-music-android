            package com.google.mlkit.genai.common;

            import java.lang.invoke.VarHandle;
            import p000.i1I1il;
            import p000.iOo1ilioooI0;
            import p000.iil1iO0il;
            
            public abstract class BaseOptions {
                public abstract Integer getTargetVersion();

                public int getTargetVersionOrDefault() {
                    iOo1ilioooI0 ioo1ilioooi0;
/* 1 */             Integer targetVersion = getTargetVersion();
/* 5 */             if (targetVersion == null) {
/* 7 */                 ioo1ilioooi0 = i1I1il.I00iOIl;
                    } else {
/* 12 */                iil1iO0il iil1io0il = new iil1iO0il();
/* 15 */                iil1io0il.I00iOIl = targetVersion;
/* 17 */                VarHandle.storeStoreFence();
/* 20 */                ioo1ilioooi0 = iil1io0il;
                    }
/* 32 */            return ((Integer) ioo1ilioooi0.I00000oIO(-1)).intValue();
                }
            }
