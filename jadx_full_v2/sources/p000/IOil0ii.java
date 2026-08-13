            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ActivityInfo;
            import android.content.pm.ResolveInfo;
            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class IOil0ii implements IlliOIo0o10 {
                public final int I00iOIl;

                public IOil0ii(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object I0010I0i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i;
                    int i2;
/* 1 */             int i3 = this.I00iOIl;
/* 6 */             int i4 = Barcode.FORMAT_ITF;
/* 17 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i3) {
                        case 0:
/* 190 */                   Oloo01 oloo01 = (Oloo01) obj;
/* 192 */                   Olol1IOOol0 olol1IOOol0 = (Olol1IOOol0) obj2;
/* 194 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) obj3;
/* 196 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj4;
/* 200 */                   int iIntValue = ((Integer) obj5).intValue();
/* 206 */                   if ((iIntValue & 6) == 0) {
/* 224 */                       i = iIntValue | ((iIntValue & 8) == 0 ? iloI0lOlll1.I000II(oloo01) : iloI0lOlll1.I000OOo1O(oloo01) ? 4 : 2);
                            } else {
/* 227 */                       i = iIntValue;
                            }
/* 230 */                   if ((iIntValue & 48) == 0) {
/* 248 */                       i |= (iIntValue & 64) == 0 ? iloI0lOlll1.I000II(olol1IOOol0) : iloI0lOlll1.I000OOo1O(olol1IOOol0) ? 32 : 16;
                            }
/* 251 */                   if ((iIntValue & 384) == 0) {
/* 257 */                       if (iloI0lOlll1.I000OOo1O(illOOo00lI)) {
/* 259 */                           i4 = 256;
                                }
/* 260 */                       i |= i4;
                            }
/* 272 */                   if (!iloI0lOlll1.I00OIl(i & 1, (i & 1171) != 1170)) {
/* 280 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 276 */                       IiII11OIl.I0000Il00O(oloo01, olol1IOOol0, illOOo00lI, iloI0lOlll1, i & 1022);
                                break;
                            }
                        case 1:
/* 96 */                    Oloo01 oloo012 = (Oloo01) obj;
/* 98 */                    Olol1IOOol0 olol1IOOol02 = (Olol1IOOol0) obj2;
/* 100 */                   IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj3;
/* 102 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj4;
/* 106 */                   int iIntValue2 = ((Integer) obj5).intValue();
/* 112 */                   if ((iIntValue2 & 6) == 0) {
/* 130 */                       i2 = iIntValue2 | ((iIntValue2 & 8) == 0 ? iloI0lOlll12.I000II(oloo012) : iloI0lOlll12.I000OOo1O(oloo012) ? 4 : 2);
                            } else {
/* 133 */                       i2 = iIntValue2;
                            }
/* 136 */                   if ((iIntValue2 & 48) == 0) {
/* 154 */                       i2 |= (iIntValue2 & 64) == 0 ? iloI0lOlll12.I000II(olol1IOOol02) : iloI0lOlll12.I000OOo1O(olol1IOOol02) ? 32 : 16;
                            }
/* 157 */                   if ((iIntValue2 & 384) == 0) {
/* 163 */                       if (iloI0lOlll12.I000OOo1O(illOOo00lI2)) {
/* 165 */                           i4 = 256;
                                }
/* 166 */                       i2 |= i4;
                            }
/* 178 */                   if (!iloI0lOlll12.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 186 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 182 */                       IiII11OIl.I0000Il00O(oloo012, olol1IOOol02, illOOo00lI2, iloI0lOlll12, i2 & 1022);
                                break;
                            }
                        default:
/* 28 */                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
/* 36 */                    long j = ((Oo0lI00l) obj5).I00000oIO;
/* 50 */                    String string = ((CharSequence) obj4).subSequence(Oo0lI00l.I000II(j), Oo0lI00l.I0001Ioi1lo(j)).toString();
/* 73 */                    Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
/* 77 */                    ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
/* 83 */                    Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
/* 89 */                    className.putExtra("android.intent.extra.PROCESS_TEXT", string);
/* 92 */                    ((Context) obj).startActivity(className);
                            break;
                    }
/* 95 */            return ooiIlOl1iI;
                }
            }
