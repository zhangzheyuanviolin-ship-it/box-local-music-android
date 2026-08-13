            package p000;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.content.res.AssetFileDescriptor;
            import android.content.res.Resources;
            import android.content.res.XmlResourceParser;
            import android.graphics.Point;
            import android.graphics.drawable.BitmapDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.VectorDrawable;
            import android.net.Uri;
            import android.os.Bundle;
            import android.util.TypedValue;
            import android.webkit.MimeTypeMap;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import org.xmlpull.v1.XmlPullParserException;
            
            public final class I1O1Il1iIill implements IlIO00OOi1OO {
                public final int I00000oIO;
                public Uri I00000oOI;
                public OIil0IlIIol I0000Il00O;

                /* JADX WARN: Removed duplicated region for block: B:82:0x01c3  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoil1iiIilo iOoil1iiIilo) throws XmlPullParserException, Resources.NotFoundException, IOException {
                    InputStream inputStreamOpenInputStream;
                    List<String> pathSegments;
                    int size;
                    Bundle bundle;
                    Integer numI000lI;
                    Drawable drawable;
/* 4 */             boolean z = true;
                    switch (this.I00000oIO) {
                        case 0:
/* 541 */                   String strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i(IOOi0Ool1i.I001iOo1i0O(this.I00000oOI.getPathSegments(), 1), "/", null, null, null, 62);
/* 588 */                   return new OlIIO11IoO1(new OlI1oO01O0(new OOliO0(l1l01I.I00000oIO(this.I0000Il00O.I00000oIO.getAssets().open(strI00IlilI0i0i))), new I1O10io()), I000O01llI0.I00000oOI(MimeTypeMap.getSingleton(), strI00IlilI0i0i), Ii1I1OOilolI.I00iiO);
                        case 1:
/* 293 */                   OIil0IlIIol oIil0IlIIol = this.I0000Il00O;
/* 297 */                   ContentResolver contentResolver = oIil0IlIIol.I00000oIO.getContentResolver();
/* 301 */                   Uri uri = this.I00000oOI;
/* 315 */                   if (O0000Ioio00.I0000O(uri.getAuthority(), "com.android.contacts") && O0000Ioio00.I0000O(uri.getLastPathSegment(), "display_photo")) {
/* 331 */                       AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
/* 342 */                       inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
/* 343 */                       if (inputStreamOpenInputStream == null) {
/* 349 */                           IOOlIIilOl0.I0001Ioi1lo(uri, "Unable to find a contact photo associated with '", "'.");
/* 5 */                             return null;
                                }
                            } else if (O0000Ioio00.I0000O(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && O0000Ioio00.I0000O(pathSegments.get(size - 3), "audio") && O0000Ioio00.I0000O(pathSegments.get(size - 2), "albums")) {
/* 406 */                       Ol0i11lo1l1I ol0i11lo1l1I = oIil0IlIIol.I0000O;
/* 408 */                       il1OioiO il1oioio = ol0i11lo1l1I.I00000oIO;
/* 417 */                       Iii10I11ll0 iii10I11ll0 = il1oioio instanceof Iii10I11ll0 ? (Iii10I11ll0) il1oioio : null;
/* 418 */                       if (iii10I11ll0 != null) {
/* 420 */                           int i = iii10I11ll0.I00000oIO;
/* 422 */                           il1OioiO il1oioio2 = ol0i11lo1l1I.I00000oOI;
/* 431 */                           Iii10I11ll0 iii10I11ll02 = il1oioio2 instanceof Iii10I11ll0 ? (Iii10I11ll0) il1oioio2 : null;
/* 432 */                           if (iii10I11ll02 != null) {
/* 434 */                               int i2 = iii10I11ll02.I00000oIO;
/* 438 */                               bundle = new Bundle(1);
/* 448 */                               bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                                    } else {
/* 452 */                               bundle = null;
                                    }
/* 455 */                           AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
/* 466 */                           inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
/* 467 */                           if (inputStreamOpenInputStream == null) {
/* 472 */                               IOOlIIilOl0.I0001Ioi1lo(uri, "Unable to find a music thumbnail associated with '", "'.");
/* 5 */                                 return null;
                                    }
                                }
                            } else {
/* 476 */                       inputStreamOpenInputStream = contentResolver.openInputStream(uri);
/* 480 */                       if (inputStreamOpenInputStream == null) {
/* 515 */                           IOOlIIilOl0.I0001Ioi1lo(uri, "Unable to open '", "'.");
/* 5 */                             return null;
                                }
                            }
/* 509 */                   return new OlIIO11IoO1(new OlI1oO01O0(new OOliO0(l1l01I.I00000oIO(inputStreamOpenInputStream)), new I1O10io()), contentResolver.getType(uri), Ii1I1OOilolI.I00iiO);
                        default:
/* 9 */                     OIil0IlIIol oIil0IlIIol2 = this.I0000Il00O;
/* 11 */                    Uri uri2 = this.I00000oOI;
/* 13 */                    String authority = uri2.getAuthority();
/* 19 */                    if (authority != null) {
/* 25 */                        if (OlOoOIi0o.I001l0I00(authority)) {
/* 28 */                            authority = null;
                                }
/* 29 */                        if (authority != null) {
/* 39 */                            String str = (String) IOOi0Ool1i.I00IoIO0lI(uri2.getPathSegments());
/* 41 */                            if (str == null || (numI000lI = OlOolloIIOl0.I000lI(10, str)) == null) {
/* 285 */                               IoOOl0iOl1io.I000OOo1O("Invalid android.resource URI: ", uri2);
/* 5 */                                 return null;
                                    }
/* 51 */                            int iIntValue = numI000lI.intValue();
/* 55 */                            Context context = oIil0IlIIol2.I00000oIO;
/* 76 */                            Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
/* 82 */                            TypedValue typedValue = new TypedValue();
/* 85 */                            resources.getValue(iIntValue, typedValue, true);
/* 88 */                            CharSequence charSequence = typedValue.string;
/* 114 */                           String strI00000oOI = I000O01llI0.I00000oOI(MimeTypeMap.getSingleton(), charSequence.subSequence(OlOoOIi0o.I001lllioOl(charSequence, '/', 0, 6), charSequence.length()).toString());
/* 124 */                           if (!O0000Ioio00.I0000O(strI00000oOI, "text/xml")) {
/* 244 */                               TypedValue typedValue2 = new TypedValue();
/* 259 */                               OOliO0 oOliO0 = new OOliO0(l1l01I.I00000oIO(resources.openRawResource(iIntValue, typedValue2)));
/* 264 */                               int i3 = typedValue2.density;
/* 266 */                               Oi0loOI1I0l oi0loOI1I0l = new Oi0loOI1I0l();
/* 269 */                               oi0loOI1I0l.I00000oIO = i3;
/* 271 */                               VarHandle.storeStoreFence();
/* 281 */                               return new OlIIO11IoO1(new OlI1oO01O0(oOliO0, oi0loOI1I0l), strI00000oOI, Ii1I1OOilolI.I00iiO);
                                    }
/* 136 */                           if (authority.equals(context.getPackageName())) {
/* 138 */                               drawable = iOO0oOI1Ol.I00000oIO(context, iIntValue);
/* 142 */                               if (drawable == null) {
/* 149 */                                   IOOlIIilOl0.I0000oI00(Oi010OO0.I000oI1ioi(iIntValue, "Invalid resource ID: "));
/* 5 */                                     return null;
                                        }
                                    } else {
/* 154 */                               XmlResourceParser xml = resources.getXml(iIntValue);
/* 158 */                               int next = xml.next();
/* 162 */                               while (next != 2 && next != 1) {
/* 166 */                                   next = xml.next();
                                        }
/* 171 */                               if (next != 2) {
/* 241 */                                   throw new XmlPullParserException("No start tag found.");
                                        }
/* 173 */                               Resources.Theme theme = context.getTheme();
/* 177 */                               ThreadLocal threadLocal = Oi0oolOI.I00000oIO;
/* 179 */                               drawable = resources.getDrawable(iIntValue, theme);
/* 183 */                               if (drawable == null) {
/* 230 */                                   IOOlIIilOl0.I0000oI00(Oi010OO0.I000oI1ioi(iIntValue, "Invalid resource ID: "));
/* 5 */                                     return null;
                                        }
                                    }
/* 187 */                           if (!(drawable instanceof VectorDrawable) && !(drawable instanceof Ooo1IlOO)) {
/* 194 */                               z = false;
                                    }
/* 197 */                           if (z) {
/* 217 */                               drawable = new BitmapDrawable(context.getResources(), ilI00Ioo.I00000oIO(drawable, oIil0IlIIol2.I00000oOI, oIil0IlIIol2.I0000O, oIil0IlIIol2.I0000oI00, oIil0IlIIol2.I0001Ioi1lo));
                                    }
/* 222 */                           return new Iilo1lOIl01i(drawable, z, Ii1I1OOilolI.I00iiO);
                                }
                            }
/* 289 */                   IoOOl0iOl1io.I000OOo1O("Invalid android.resource URI: ", uri2);
/* 5 */                     return null;
                    }
                }
            }
