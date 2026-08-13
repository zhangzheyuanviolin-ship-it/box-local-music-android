            package p000;

            import android.content.Context;
            import com.google.ai.edge.litertlm.Contents;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public interface O11il1ilio1o {
                static void I00000oOI(O11il1ilio1o o11il1ilio1o, O1oIOiI11o0 o1oIOiI11o0, String str, Function3 function3, IllOOo00lI illOOo00lI, Function1 function1, List list, IOO11li1OoII iOO11li1OoII, int i) {
/* 3 */             int i2 = i & 64;
/* 5 */             Il01100l il01100l = Il01100l.I00iOIl;
/* 31 */            o11il1ilio1o.I0001Ioi1lo(o1oIOiI11o0, str, function3, illOOo00lI, function1, il01100l, i2 != 0 ? il01100l : list, (i & Barcode.FORMAT_ITF) != 0 ? null : iOO11li1OoII, null);
                }

                static void I000O01llI0(O11il1ilio1o o11il1ilio1o, O1oIOiI11o0 o1oIOiI11o0, boolean z, boolean z2, Contents contents, List list, boolean z3, int i) {
/* 3 */             if ((i & 8) != 0) {
/* 5 */                 contents = null;
                    }
/* 8 */             if ((i & 16) != 0) {
/* 10 */                list = Il01100l.I00iOIl;
                    }
/* 14 */            if ((i & 32) != 0) {
/* 16 */                z3 = false;
                    }
/* 17 */            o11il1ilio1o.I0000Il00O(o1oIOiI11o0, contents, list, z3);
                }

                void I00000oIO(O1oIOiI11o0 o1oIOiI11o0, IllOOo00lI illOOo00lI);

                void I0000Il00O(O1oIOiI11o0 o1oIOiI11o0, Contents contents, List list, boolean z);

                void I0000O(Context context, O1oIOiI11o0 o1oIOiI11o0, boolean z, boolean z2, Function1 function1, Contents contents, List list, boolean z3, Ii0110 ii0110);

                void I0000oI00(O1oIOiI11o0 o1oIOiI11o0);

                void I0001Ioi1lo(O1oIOiI11o0 o1oIOiI11o0, String str, Function3 function3, IllOOo00lI illOOo00lI, Function1 function1, List list, List list2, Ii0110 ii0110, Map map);
            }
