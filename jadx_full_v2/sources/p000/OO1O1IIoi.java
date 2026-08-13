            package p000;

            import android.app.RemoteAction;
            import android.content.Context;
            import android.graphics.drawable.Drawable;
            import android.text.TextUtils;
            import android.view.textclassifier.TextClassification;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OO1O1IIoi {
                public static final OlO1iIi1ol0 I00000oIO = new OlO1iIi1ol0(new O1olloI0OlO(11));
                public static final IOio001ooo I00000oOI = new IOio001ooo(2);

                public static final void I00000oIO(OloilI0Ol oloilI0Ol, Context context, boolean z, CharSequence charSequence, Oo0lI00l oo0lI00l, OO1O0I oo1o0i, Function1 function1) {
/* 7 */             if (charSequence == null || oo0lI00l == null || oo1o0i == null) {
/* 174 */               function1.invoke(oloilI0Ol);
/* 177 */               if (charSequence == null || oo0lI00l == null) {
/* 965 */                   return;
                        }
/* 187 */               lIIi1OI0.I00000oIO(oloilI0Ol, context, z, charSequence, oo0lI00l.I00000oIO);
/* 965 */               return;
                    }
/* 13 */            long j = oo0lI00l.I00000oIO;
/* 15 */            Object obj = oo1o0i.I000O01llI0;
/* 17 */            OI1I0OoOl oI1I0OoOl = oo1o0i.I0000oI00;
/* 23 */            OloiIl oloiIl = null;
/* 24 */            if (oI1I0OoOl.I000II()) {
/* 33 */                OloiIl oloiIl2 = (OloiIl) oo1o0i.I000II.getValue();
/* 35 */                if (oloiIl2 == null || !Oo0lI00l.I0000Il00O(j, oloiIl2.I00000oOI) || !O0000Ioio00.I0000O(charSequence, oloiIl2.I00000oIO)) {
/* 54 */                    oloiIl2 = null;
                        }
/* 55 */                oI1I0OoOl.I00000oOI(null);
/* 58 */                oloiIl = oloiIl2;
                    }
/* 59 */            if (oloiIl == null) {
/* 61 */                function1.invoke(oloilI0Ol);
                    } else {
/* 65 */                ArrayList arrayList = oloiIl.I0000O;
/* 67 */                TextClassification textClassification = oloiIl.I0000Il00O;
/* 80 */                if (!textClassification.getActions().isEmpty()) {
/* 88 */                    lOiolIl1l101.I00000oIO(oloilI0Ol, obj, textClassification, 0, (Drawable) arrayList.get(0));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
/* 125 */                   lOiolIl1l101.I00000oIO(oloilI0Ol, obj, textClassification, -1, textClassification.getIcon());
                        }
/* 128 */               function1.invoke(oloilI0Ol);
/* 131 */               List<RemoteAction> actions = textClassification.getActions();
/* 138 */               int size = actions.size();
/* 142 */               for (int i = 0; i < size; i++) {
/* 144 */                   actions.get(i);
/* 150 */                   if (i > 0) {
/* 158 */                       lOiolIl1l101.I00000oIO(oloilI0Ol, obj, textClassification, i, (Drawable) arrayList.get(i));
                            }
                        }
                    }
/* 170 */           lIIi1OI0.I00000oIO(oloilI0Ol, context, z, charSequence, oo0lI00l.I00000oIO);
                }

                public static final OO1O0I I00000oOI(OiiOIo1 oiiOIo1, O11oiiOIl0O o11oiiOIl0O, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i01iIIliI(430530635);
/* 13 */            Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 21 */            Ii00l101O ii00l101O = (Ii00l101O) iloI0lOlll1.I000iOII(I00000oIO);
/* 54 */            boolean zI000II = ((((i & 112) ^ 48) > 32 && iloI0lOlll1.I000II(o11oiiOIl0O)) || (i & 48) == 32) | iloI0lOlll1.I000II(ii00l101O) | iloI0lOlll1.I000II(context);
/* 55 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 59 */            if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 72 */                objI00O0i0ii = (OO1O0I) I00000oOI.I000l1(ii00l101O, context, oiiOIo1, o11oiiOIl0O);
/* 74 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 77 */            OO1O0I oo1o0i = (OO1O0I) objI00O0i0ii;
/* 79 */            iloI0lOlll1.I0010I0i(false);
/* 204 */           return oo1o0i;
                }
            }
