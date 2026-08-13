            package com.google.mlkit.genai.common;

            import java.lang.annotation.ElementType;
            import java.lang.annotation.Target;
            import java.lang.invoke.VarHandle;
            import p000.i1I1il;
            import p000.iOo1ilioooI0;
            import p000.iil1iO0il;
            
            public abstract class BaseRequest {

                @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
                public @interface OverrideRequestKind {
                }

                public abstract Integer getOverrideRequestKind();

                public int getOverrideRequestKindOrDefault() {
                    iOo1ilioooI0 ioo1ilioooi0;
/* 1 */             Integer overrideRequestKind = getOverrideRequestKind();
/* 5 */             if (overrideRequestKind == null) {
/* 7 */                 ioo1ilioooi0 = i1I1il.I00iOIl;
                    } else {
/* 12 */                iil1iO0il iil1io0il = new iil1iO0il();
/* 15 */                iil1io0il.I00iOIl = overrideRequestKind;
/* 17 */                VarHandle.storeStoreFence();
/* 20 */                ioo1ilioooi0 = iil1io0il;
                    }
/* 32 */            return ((Integer) ioo1ilioooi0.I00000oIO(0)).intValue();
                }
            }
