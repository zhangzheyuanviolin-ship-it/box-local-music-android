            package p000;

            import android.R;
            import android.app.RemoteAction;
            import android.content.Context;
            import android.graphics.drawable.Drawable;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.textclassifier.TextClassification;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class I100Iil1o1 {
                public I100OI I00000oIO;
                public I1001oll I00000oOI;
                public I1001oll I0000Il00O;
                public View I0000O;

                public final boolean I00000oIO(Menu menu) {
                    int i;
/* 11 */            Olol0I1o1IO olol0I1o1IO = (Olol0I1o1IO) this.I00000oOI.invoke();
/* 18 */            int i2 = 0;
/* 19 */            if (O0000Ioio00.I0000O(olol0I1o1IO, null)) {
/* 18 */                return false;
                    }
/* 22 */            menu.clear();
/* 25 */            List list = olol0I1o1IO.I00000oIO;
/* 30 */            int size = list.size();
/* 35 */            int i3 = 0;
/* 36 */            int i4 = 1;
/* 37 */            int i5 = 1;
/* 38 */            while (i3 < size) {
/* 44 */                OloilIOlliOi oloilIOlliOi = (OloilIOlliOi) list.get(i3);
/* 49 */                if (oloilIOlliOi instanceof OlolOO0oi) {
/* 51 */                    i = i4 + 1;
/* 53 */                    Object obj = oloilIOlliOi.I00000oIO;
/* 116 */                   OlolOO0oi ololOO0oi = (OlolOO0oi) oloilIOlliOi;
/* 120 */                   MenuItem menuItemAdd = menu.add(i5, O0000Ioio00.I0000O(obj, iO11lolO0lo.I00000oIO) ? R.id.cut : O0000Ioio00.I0000O(obj, iO11lolO0lo.I00000oOI) ? R.id.copy : O0000Ioio00.I0000O(obj, iO11lolO0lo.I0000Il00O) ? R.id.paste : O0000Ioio00.I0000O(obj, iO11lolO0lo.I0000O) ? R.id.selectAll : O0000Ioio00.I0000O(obj, iO11lolO0lo.I0000oI00) ? R.id.autofill : i4, i4, ololOO0oi.I00000oOI);
/* 124 */                   menuItemAdd.setShowAsAction(2);
/* 129 */                   I100I01ioll i100I01ioll = new I100I01ioll(i2);
/* 132 */                   i100I01ioll.I00000oOI = ololOO0oi;
/* 134 */                   i100I01ioll.I0000Il00O = this;
/* 136 */                   VarHandle.storeStoreFence();
/* 139 */                   menuItemAdd.setOnMenuItemClickListener(i100I01ioll);
                        } else if (oloilIOlliOi instanceof Oloo0Oooi) {
/* 149 */                   i = i4 + 1;
/* 153 */                   Context context = this.I0000O.getContext();
/* 157 */                   Oloo0Oooi oloo0Oooi = (Oloo0Oooi) oloilIOlliOi;
/* 159 */                   TextClassification textClassification = oloo0Oooi.I00000oOI;
/* 161 */                   int i6 = oloo0Oooi.I0000Il00O;
/* 163 */                   Drawable drawable = oloo0Oooi.I0000O;
/* 168 */                   if (i6 < 0) {
/* 174 */                       MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i4, textClassification.getLabel());
/* 178 */                       menuItemAdd2.setShowAsAction(2);
/* 181 */                       menuItemAdd2.setIcon(drawable);
/* 186 */                       I100I01ioll i100I01ioll2 = new I100I01ioll(1);
/* 189 */                       i100I01ioll2.I00000oOI = context;
/* 191 */                       i100I01ioll2.I0000Il00O = textClassification;
/* 193 */                       VarHandle.storeStoreFence();
/* 196 */                       menuItemAdd2.setOnMenuItemClickListener(i100I01ioll2);
                            } else {
/* 204 */                       int i7 = i6 == 0 ? 1 : i2;
/* 209 */                       RemoteAction remoteAction = textClassification.getActions().get(i6);
/* 224 */                       MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i7 != 0 ? 16908353 : i2, i4, remoteAction.getTitle());
/* 232 */                       menuItemAdd3.setShowAsAction(i7 == 0 ? 0 : 2);
/* 235 */                       if (drawable != null) {
/* 237 */                           menuItemAdd3.setIcon(drawable);
                                }
/* 242 */                       Oo0lolo11i oo0lolo11i = new Oo0lolo11i();
/* 245 */                       oo0lolo11i.I00000oIO = remoteAction;
/* 247 */                       VarHandle.storeStoreFence();
/* 250 */                       menuItemAdd3.setOnMenuItemClickListener(oo0lolo11i);
                            }
                        } else {
/* 256 */                   if (oloilIOlliOi instanceof Ololoi) {
/* 258 */                       i5++;
                            }
/* 260 */                   i3++;
/* 262 */                   i2 = 0;
                        }
/* 142 */               i4 = i;
/* 260 */               i3++;
/* 262 */               i2 = 0;
                    }
/* 34 */            return true;
                }
            }
