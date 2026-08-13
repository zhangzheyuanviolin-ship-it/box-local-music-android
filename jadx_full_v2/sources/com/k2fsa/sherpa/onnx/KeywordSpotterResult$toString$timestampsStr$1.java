            package com.k2fsa.sherpa.onnx;

            import java.util.Arrays;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import p000.O0iO10011II;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, m18k = 3, mv = {1, 7, 1}, xi = 48)
/* 19 */    public final class KeywordSpotterResult$toString$timestampsStr$1 extends O0iO10011II implements Function1 {
                public static final KeywordSpotterResult$toString$timestampsStr$1 INSTANCE = new KeywordSpotterResult$toString$timestampsStr$1();

                public KeywordSpotterResult$toString$timestampsStr$1() {
/* 2 */             super(1);
                }

                public final CharSequence invoke(float f) {
/* 16 */            return String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                }

                @Override
/* 20 */        public Object invoke(Object obj) {
/* 21 */            return invoke(((Number) obj).floatValue());
                }
            }
