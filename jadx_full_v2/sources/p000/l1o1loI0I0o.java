            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.XmlResourceParser;
            import android.graphics.drawable.BitmapDrawable;
            import android.util.TypedValue;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import org.xmlpull.v1.XmlPullParserException;
            
            public abstract class l1o1loI0I0o {
                public static final OIoOo11 I00000oIO(int i, IloI0lOlll1 iloI0lOlll1) {
                    TypedValue typedValue;
/* 7 */             Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 15 */            Resources resources = (Resources) iloI0lOlll1.I000iOII(I0lloOI0oio.I0000Il00O);
/* 23 */            Oi0lI0 oi0lI0 = (Oi0lI0) iloI0lOlll1.I000iOII(I0lloOI0oio.I0000oI00);
                    synchronized (oi0lI0) {
/* 32 */                typedValue = (TypedValue) oi0lI0.I00000oIO.I00000oOI(i);
/* 35 */                if (typedValue == null) {
/* 39 */                    typedValue = new TypedValue();
/* 42 */                    resources.getValue(i, typedValue, true);
/* 45 */                    OI0l1oli1I oI0l1oli1I = oi0lI0.I00000oIO;
/* 47 */                    int iI0000O = oI0l1oli1I.I0000O(i);
/* 51 */                    Object[] objArr = oI0l1oli1I.I0000Il00O;
/* 53 */                    Object obj = objArr[iI0000O];
/* 57 */                    oI0l1oli1I.I00000oOI[iI0000O] = i;
/* 59 */                    objArr[iI0000O] = typedValue;
                        }
                    }
/* 66 */            CharSequence charSequence = typedValue.string;
/* 70 */            if (charSequence == null || !OlOoOIi0o.I0010o(charSequence, ".xml")) {
/* 206 */               iloI0lOlll1.I00i01iIIliI(-1771643000);
/* 226 */               boolean zI000II = iloI0lOlll1.I000II(context.getTheme()) | iloI0lOlll1.I000II(charSequence) | iloI0lOlll1.I0000oI00(i);
/* 227 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 231 */               if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
                            try {
/* 249 */                       objI00O0i0ii = new I0oO00o(((BitmapDrawable) resources.getDrawable(i, null)).getBitmap());
/* 252 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            } catch (Exception e) {
/* 311 */                       throw new IOiIIo1l("Error attempting to load resource: " + ((Object) charSequence), e, 7);
                            }
                        }
/* 283 */               II0o0I1O10ii iI0o0I1O10ii = new II0o0I1O10ii((I0oO00o) objI00O0i0ii, (r3.I00000oIO.getHeight() & 4294967295L) | (r3.I00000oIO.getWidth() << 32));
/* 286 */               iloI0lOlll1.I0010I0i(false);
/* 289 */               return iI0o0I1O10ii;
                    }
/* 83 */            iloI0lOlll1.I00i01iIIliI(-1771798434);
/* 86 */            Resources.Theme theme = context.getTheme();
/* 90 */            int i2 = typedValue.changingConfigurations;
/* 98 */            IoiiIlOoiOo ioiiIlOoiOo = (IoiiIlOoiOo) iloI0lOlll1.I000iOII(I0lloOI0oio.I0000O);
/* 102 */           Ioii1iOi00 ioii1iOi00 = new Ioii1iOi00();
/* 105 */           ioii1iOi00.I00000oIO = theme;
/* 107 */           ioii1iOi00.I00000oOI = i;
/* 109 */           VarHandle.storeStoreFence();
/* 118 */           WeakReference weakReference = (WeakReference) ioiiIlOoiOo.I00000oIO.get(ioii1iOi00);
/* 129 */           IoiOoolI ioiOoolII00000oIO = weakReference != null ? (IoiOoolI) weakReference.get() : null;
/* 130 */           if (ioiOoolII00000oIO == null) {
/* 132 */               XmlResourceParser xml = resources.getXml(i);
/* 136 */               int next = xml.next();
/* 141 */               while (next != 2 && next != 1) {
/* 145 */                   next = xml.next();
                        }
/* 150 */               if (next != 2) {
/* 192 */                   throw new XmlPullParserException("No start tag found");
                        }
/* 162 */               if (!O0000Ioio00.I0000O(xml.getName(), "vector")) {
/* 181 */                   I000II.I000iOII("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
/* 68 */                    return null;
                        }
/* 164 */               ioiOoolII00000oIO = li1OOi.I00000oIO(theme, resources, xml, i2);
/* 175 */               ioiiIlOoiOo.I00000oIO.put(ioii1iOi00, new WeakReference(ioiOoolII00000oIO));
                    }
/* 195 */           Ooo1l0o ooo1l0oI00000oOI = li1OOO.I00000oOI(ioiOoolII00000oIO.I00000oIO, iloI0lOlll1);
/* 199 */           iloI0lOlll1.I0010I0i(false);
/* 202 */           return ooo1l0oI00000oOI;
                }
            }
