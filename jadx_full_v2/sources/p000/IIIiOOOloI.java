            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.net.Uri;
            import java.io.File;
            import java.nio.ByteBuffer;
            import java.util.List;
            
            public final class IIIiOOOloI {
                public final int I00000oIO;

                public final Object I00000oIO(Object obj, OIil0IlIIol oIil0IlIIol) throws PackageManager.NameNotFoundException {
                    String authority;
                    switch (this.I00000oIO) {
                        case 0:
/* 263 */                   return ByteBuffer.wrap((byte[]) obj);
                        case 1:
/* 181 */                   Uri uri = (Uri) obj;
/* 187 */                   if (I000O01llI0.I0000Il00O(uri)) {
/* 9 */                         return null;
                            }
/* 189 */                   String scheme = uri.getScheme();
/* 195 */                   if (scheme != null && !scheme.equals("file")) {
/* 9 */                         return null;
                            }
/* 203 */                   String path = uri.getPath();
/* 215 */                   if (!OlOoOIi0o.I00IoiI(path != null ? path : "", '/') || ((String) IOOi0Ool1i.I00II0Ol1O0l(uri.getPathSegments())) == null) {
/* 9 */                         return null;
                            }
/* 237 */                   if (!O0000Ioio00.I0000O(uri.getScheme(), "file")) {
/* 257 */                       return new File(uri.toString());
                            }
/* 239 */                   String path2 = uri.getPath();
/* 243 */                   if (path2 != null) {
/* 247 */                       return new File(path2);
                            }
/* 9 */                     return null;
                        case 2:
/* 178 */                   return ((IoOi01OlIl1o) obj).I000O01llI0;
                        case 3:
/* 133 */                   int iIntValue = ((Number) obj).intValue();
/* 137 */                   Context context = oIil0IlIIol.I00000oIO;
                            try {
/* 147 */                       if (context.getResources().getResourceEntryName(iIntValue) == null) {
/* 9 */                             return null;
                                }
/* 171 */                       return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                            } catch (Resources.NotFoundException unused) {
/* 9 */                         return null;
                            }
                        case 4:
/* 20 */                    Uri uri2 = (Uri) obj;
/* 32 */                    if (!O0000Ioio00.I0000O(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || OlOoOIi0o.I001l0I00(authority) || uri2.getPathSegments().size() != 2) {
/* 9 */                         return null;
                            }
/* 60 */                    String authority2 = uri2.getAuthority();
/* 5 */                     String str = authority2 != null ? authority2 : "";
/* 74 */                    Resources resourcesForApplication = oIil0IlIIol.I00000oIO.getPackageManager().getResourcesForApplication(str);
/* 78 */                    List<String> pathSegments = uri2.getPathSegments();
/* 96 */                    int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
/* 100 */                   if (identifier == 0) {
/* 127 */                       IoOOl0iOl1io.I001lIiIIo1O("Invalid android.resource URI: ", uri2);
/* 9 */                         return null;
                            }
/* 120 */                   return Uri.parse("android.resource://" + str + '/' + identifier);
                        default:
/* 15 */                    return Uri.parse((String) obj);
                    }
                }
            }
