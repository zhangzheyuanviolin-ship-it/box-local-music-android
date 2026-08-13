            package com.google.mlkit.vision.vkp;

            import java.util.Set;
            import p000.O1o01iO0liI0;
            import p000.lIiI1010Ool;
            import p000.lIll1lOoI1;
            
            public abstract class VkpStatus {

                public static abstract class VkpError {
                    public abstract int getErrorCode();

                    public abstract int getErrorSpaceNumber();
                }

                public static VkpStatus zza(O1o01iO0liI0 o1o01iO0liI0) {
/* 3 */             int i = lIiI1010Ool.I00o0iI0io1;
/* 8 */             return new AutoValue_VkpStatus(false, o1o01iO0liI0, lIll1lOoI1.I00oOio10iI1);
                }

                public static VkpStatus zzb() {
/* 3 */             int i = lIiI1010Ool.I00o0iI0io1;
/* 9 */             return new AutoValue_VkpStatus(true, null, lIll1lOoI1.I00oOio10iI1);
                }

                public abstract Set<VkpError> getErrors();

                public abstract O1o01iO0liI0 getMlKitException();

                public abstract boolean isSuccess();

                public void throwsMlKitExceptionIfPresent() throws O1o01iO0liI0 {
/* 1 */             O1o01iO0liI0 mlKitException = getMlKitException();
/* 5 */             if (mlKitException != null) {
/* 29 */                throw mlKitException;
                    }
                }
            }
