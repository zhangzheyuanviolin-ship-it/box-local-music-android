            package com.jegly.offlineLLM.smollm;

            import kotlin.Metadata;
            import p000.I000II;
            import p000.I1iIil1I;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.Ii1oo1ooill0;
            import p000.IiI0oillOO10;
            import p000.IiiIil1lOIO;
            import p000.IlloioO0I1i;
            import p000.OoiIlOl1iI;
            import p000.iOi1II01i0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u0011J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/jegly/offlineLLM/smollm/GGUFReader;", "", "<init>", "()V", "", "modelPath", "", "getGGUFContextNativeHandle", "(Ljava/lang/String;)J", "nativeHandle", "getContextSize", "(J)J", "getChatTemplate", "(J)Ljava/lang/String;", "LOoiIlOl1iI;", "load", "(Ljava/lang/String;LIOoil1iiIilo;)Ljava/lang/Object;", "()Ljava/lang/Long;", "()Ljava/lang/String;", "J", "Companion", "IlloioO0I1i", "smollm"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class GGUFReader {
                public static final IlloioO0I1i Companion = new IlloioO0I1i();
                private long nativeHandle;

                static {
/* 10 */            System.loadLibrary("ggufreader");
                }

                private final native String getChatTemplate(long nativeHandle);

                private final native long getContextSize(long nativeHandle);

                private final native long getGGUFContextNativeHandle(String modelPath);

                public final String getChatTemplate() {
/* 1 */             long j = this.nativeHandle;
/* 8 */             if (j == 0) {
/* 24 */                I000II.I001IO000("Use GGUFReader.load() to initialize the reader");
/* 7 */                 return null;
                    }
/* 10 */            String chatTemplate = getChatTemplate(j);
/* 18 */            if (chatTemplate.length() == 0) {
/* 7 */                 return null;
                    }
/* 21 */            return chatTemplate;
                }

                public final Long getContextSize() {
/* 1 */             long j = this.nativeHandle;
/* 8 */             if (j == 0) {
/* 28 */                I000II.I001IO000("Use GGUFReader.load() to initialize the reader");
/* 7 */                 return null;
                    }
/* 10 */            long contextSize = getContextSize(j);
/* 18 */            if (contextSize == -1) {
/* 7 */                 return null;
                    }
/* 21 */            return Long.valueOf(contextSize);
                }

                public final Object load(String str, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 13 */            Object objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I1iIil1I(this, str, null, 23), iOoil1iiIilo);
                    return objI0000oI00 == Ii0111o.I00iOIl ? objI0000oI00 : OoiIlOl1iI.I00000oIO;
                }
            }
