            package p000;

            import android.webkit.PermissionRequest;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.google.mlkit.vision.text.Text;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IlI0iIl011 implements Function1 {
                public final int I00iOIl;
                public OI10i0Il I00iiI;

                public IlI0iIl011(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             OI10i0Il oI10i0Il = this.I00iiI;
                    switch (i) {
                        case 0:
/* 398 */                   oI10i0Il.setValue((String) obj);
/* 401 */                   return ooiIlOl1iI;
                        case 1:
/* 392 */                   oI10i0Il.setValue((String) obj);
/* 395 */                   return ooiIlOl1iI;
                        case 2:
/* 381 */                   Boolean bool = (Boolean) obj;
/* 383 */                   bool.getClass();
/* 386 */                   oI10i0Il.setValue(bool);
/* 389 */                   return ooiIlOl1iI;
                        case 3:
/* 377 */                   oI10i0Il.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
/* 380 */                   return ooiIlOl1iI;
                        case 4:
/* 361 */                   oI10i0Il.setValue((IllOOo00lI) obj);
/* 364 */                   return ooiIlOl1iI;
                        case 5:
/* 350 */                   Boolean bool2 = (Boolean) obj;
/* 352 */                   bool2.getClass();
/* 355 */                   oI10i0Il.setValue(bool2);
/* 358 */                   return ooiIlOl1iI;
                        case 6:
/* 346 */                   oI10i0Il.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
/* 349 */                   return ooiIlOl1iI;
                        case 7:
/* 330 */                   oI10i0Il.setValue((IllOOo00lI) obj);
/* 333 */                   return ooiIlOl1iI;
                        case 8:
/* 301 */                   boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 309 */                   PermissionRequest permissionRequest = (PermissionRequest) oI10i0Il.getValue();
/* 311 */                   if (permissionRequest != null) {
/* 313 */                       if (zBooleanValue) {
/* 321 */                           permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                                }
/* 324 */                       oI10i0Il.setValue(null);
                            }
/* 327 */                   return ooiIlOl1iI;
                        case 9:
/* 272 */                   boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
/* 280 */                   PermissionRequest permissionRequest2 = (PermissionRequest) oI10i0Il.getValue();
/* 282 */                   if (permissionRequest2 != null) {
/* 284 */                       if (zBooleanValue2) {
/* 292 */                           permissionRequest2.grant(new String[]{"android.webkit.resource.AUDIO_CAPTURE"});
                                }
/* 295 */                       oI10i0Il.setValue(null);
                            }
/* 298 */                   return ooiIlOl1iI;
                        case 10:
/* 251 */                   List list = (List) obj;
/* 260 */                   if (!list.isEmpty()) {
/* 266 */                       oI10i0Il.setValue(Iloo0ilo.I000O01llI0(list));
                            }
/* 269 */                   return ooiIlOl1iI;
                        case 11:
/* 216 */                   List list2 = (List) obj;
/* 225 */                   if (!list2.isEmpty()) {
/* 247 */                       oI10i0Il.setValue(IOOi0Ool1i.I00IlilI0i0i(list2, "\n", null, null, new Ilo10O1IlOl(18), 30));
                            }
/* 250 */                   return ooiIlOl1iI;
                        case 12:
/* 181 */                   List list3 = (List) obj;
/* 190 */                   if (!list3.isEmpty()) {
/* 212 */                       oI10i0Il.setValue(IOOi0Ool1i.I00IlilI0i0i(list3, "\n", null, null, new Ilo10O1IlOl(19), 30));
                            }
/* 215 */                   return ooiIlOl1iI;
                        case 13:
/* 161 */                   Text text = (Text) obj;
/* 171 */                   if (text.getText().length() > 0) {
/* 177 */                       oI10i0Il.setValue(text.getText());
                            }
/* 180 */                   return ooiIlOl1iI;
                        case 14:
/* 157 */                   oI10i0Il.setValue((String) obj);
/* 160 */                   return ooiIlOl1iI;
                        case 15:
/* 151 */                   oI10i0Il.setValue((String) obj);
/* 154 */                   return ooiIlOl1iI;
                        case 16:
/* 145 */                   oI10i0Il.setValue((String) obj);
/* 148 */                   return ooiIlOl1iI;
                        case 17:
/* 139 */                   oI10i0Il.setValue((OI1O101) obj);
/* 142 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 128 */                   Boolean bool3 = (Boolean) obj;
/* 130 */                   bool3.booleanValue();
/* 133 */                   oI10i0Il.setValue(bool3);
/* 136 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 124 */                   oI10i0Il.setValue((Conversation) obj);
/* 127 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 111 */                   Integer num = (Integer) obj;
/* 113 */                   num.intValue();
/* 116 */                   List list4 = Iloo0ilo.I00000oIO;
/* 118 */                   oI10i0Il.setValue(num);
/* 121 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 100 */                   Integer num2 = (Integer) obj;
/* 102 */                   num2.intValue();
/* 105 */                   List list5 = Iloo0ilo.I00000oIO;
/* 107 */                   oI10i0Il.setValue(num2);
/* 110 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 89 */                    Integer num3 = (Integer) obj;
/* 91 */                    num3.intValue();
/* 94 */                    List list6 = Iloo0ilo.I00000oIO;
/* 96 */                    oI10i0Il.setValue(num3);
/* 99 */                    return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 78 */                    Integer num4 = (Integer) obj;
/* 80 */                    num4.intValue();
/* 83 */                    List list7 = Iloo0ilo.I00000oIO;
/* 85 */                    oI10i0Il.setValue(num4);
/* 88 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 67 */                    Integer num5 = (Integer) obj;
/* 69 */                    num5.intValue();
/* 72 */                    List list8 = Iloo0ilo.I00000oIO;
/* 74 */                    oI10i0Il.setValue(num5);
/* 77 */                    return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 56 */                    Integer num6 = (Integer) obj;
/* 58 */                    num6.intValue();
/* 61 */                    List list9 = Iloo0ilo.I00000oIO;
/* 63 */                    oI10i0Il.setValue(num6);
/* 66 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 45 */                    Integer num7 = (Integer) obj;
/* 47 */                    num7.intValue();
/* 50 */                    List list10 = Iloo0ilo.I00000oIO;
/* 52 */                    oI10i0Il.setValue(num7);
/* 55 */                    return ooiIlOl1iI;
                        case 27:
/* 37 */                    if (((Boolean) obj).booleanValue()) {
/* 41 */                        oI10i0Il.setValue(Boolean.TRUE);
                            }
/* 44 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_ANKLE:
/* 22 */                    I1iIOl01I0 i1iIOl01I0 = new I1iIOl01I0(2);
/* 25 */                    i1iIOl01I0.I00000oOI = oI10i0Il;
/* 27 */                    VarHandle.storeStoreFence();
/* 30 */                    return i1iIOl01I0;
                        default:
/* 13 */                    oI10i0Il.setValue((String) obj);
/* 16 */                    return ooiIlOl1iI;
                    }
                }
            }
