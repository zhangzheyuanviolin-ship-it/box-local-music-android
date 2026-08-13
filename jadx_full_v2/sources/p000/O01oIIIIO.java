            package p000;

            import android.net.Uri;
            
            public final class O01oIIIIO extends I01loIooI {
                public final int I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O01oIIIIO(String str, Boolean bool, int i) {
/* 3 */             super(str, bool);
/* 1 */             this.I0000Il00O = i;
                }

                @Override
                public final Object I000II(String str) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 11 */                    return str;
                        default:
/* 6 */                     return Uri.parse(str);
                    }
                }
            }
