            package p000;

            import android.os.Bundle;
            import java.util.LinkedHashMap;
            
            public abstract class liO0I1oOII {
                public static Ii11I1OOII1 I00000oIO(Bundle bundle, Bundle bundle2) {
/* 3 */             Ii11I0l ii11I0l = new Ii11I0l();
/* 6 */             LinkedHashMap linkedHashMap = ii11I0l.I00000oIO;
/* 12 */            linkedHashMap.put("BUNDLE_DATA_CONVERTER_VERSION", "1.0");
/* 23 */            I0000Il00O(new Oo1ol1ll("session_bundle:", bundle, ii11I0l, 4));
/* 33 */            I00000oOI(new Oo1ol1ll("notification_bundle:", bundle2, ii11I0l, 4));
/* 38 */            Ii11I1OOII1 ii11I1OOII1 = new Ii11I1OOII1(linkedHashMap);
/* 41 */            il01ool0o.I0000Il00O(ii11I1OOII1);
/* 89 */            return ii11I1OOII1;
                }

                public static void I00000oOI(i0IoOO1i1 i0iooo1i1) {
/* 3 */             i0iooo1i1.I000OOo1O("notification_channel_name");
/* 8 */             i0iooo1i1.I000OOo1O("notification_title");
/* 13 */            i0iooo1i1.I000OOo1O("notification_subtext");
/* 18 */            i0iooo1i1.I0000oI00("notification_color");
/* 26 */            i0iooo1i1.I000O01llI0(600000L, "notification_timeout");
/* 29 */            i0iooo1i1.I00000oOI();
/* 34 */            i0iooo1i1.I000OOo1O("notification_intent_component_class_name");
/* 39 */            i0iooo1i1.I000OOo1O("notification_intent_component_package_name");
/* 44 */            i0iooo1i1.I000OOo1O("notification_intent_package");
/* 49 */            i0iooo1i1.I000OOo1O("notification_intent_action");
/* 54 */            i0iooo1i1.I000OOo1O("notification_intent_data");
/* 59 */            i0iooo1i1.I0000oI00("notification_intent_flags");
/* 64 */            i0iooo1i1.I000OOo1O("notification_intent_extra_error_dialog_document_id");
                }

                public static void I0000Il00O(i0IoOO1i1 i0iooo1i1) {
/* 3 */             i0iooo1i1.I0000oI00("session_id");
/* 8 */             i0iooo1i1.I0000oI00("app_version_code");
/* 25 */            for (String str : i0iooo1i1.I000II("pack_names")) {
/* 39 */                i0iooo1i1.I00000oIO(liIlli0IIoo.I00000oIO("pack_version", str));
/* 48 */                i0iooo1i1.I000OOo1O(liIlli0IIoo.I00000oIO("pack_version_tag", str));
/* 57 */                i0iooo1i1.I0000oI00(liIlli0IIoo.I00000oIO("status", str));
/* 66 */                i0iooo1i1.I00000oIO(liIlli0IIoo.I00000oIO("total_bytes_to_download", str));
/* 87 */                for (String str2 : i0iooo1i1.I000II(liIlli0IIoo.I00000oIO("slice_ids", str))) {
/* 101 */                   i0iooo1i1.I0000O(liIlli0IIoo.I00000oOI("chunk_intents", str, str2));
/* 110 */                   i0iooo1i1.I000OOo1O(liIlli0IIoo.I00000oOI("uncompressed_hash_sha256", str, str2));
/* 119 */                   i0iooo1i1.I00000oIO(liIlli0IIoo.I00000oOI("uncompressed_size", str, str2));
/* 128 */                   i0iooo1i1.I0000oI00(liIlli0IIoo.I00000oOI("patch_format", str, str2));
/* 137 */                   i0iooo1i1.I0000oI00(liIlli0IIoo.I00000oOI("compression_format", str, str2));
                        }
                    }
                }
            }
