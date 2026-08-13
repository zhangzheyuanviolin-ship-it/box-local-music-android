            package com.google.mlkit.vision.vkp;

            import android.text.TextUtils;
            import p000.l0IOIIIlol;
            
            public abstract class VkpImageLabel {
                public static VkpImageLabel zza(l0IOIIIlol l0ioiiilol) {
/* 1 */             String strI001i1O0Ol = l0ioiiilol.I001i1O0Ol();
/* 9 */             if (TextUtils.isEmpty(strI001i1O0Ol)) {
/* 11 */                strI001i1O0Ol = l0ioiiilol.I001IO000();
                    }
/* 29 */            return new AutoValue_VkpImageLabel(l0ioiiilol.I001IO000(), strI001i1O0Ol, l0ioiiilol.I00111O(), l0ioiiilol.I001IIilI0O());
                }

                public abstract String getClassName();

                public abstract int getIndex();

                public abstract float getScore();

                public abstract String getText();
            }
