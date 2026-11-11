package app.morphe.patches.gboard.layout

import app.morphe.patcher.patch.resourcePatch

// Adds "QWERTY + '" to the English (US) layout picker. Built for Gboard 18.5.4:
// it references that build's resource names, so the checks below refuse to run elsewhere.
private const val X = "APKTOOL_DUMMYVAL_0x7f17"

private val MAPPING_XML = """
<?xml version="1.0" encoding="utf-8"?>
<framework>
    <key_mapping>
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b18d4" view_id="@id/C01" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1a0d" view_id="@id/B01" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1905" view_id="@id/D03" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1992" view_id="@id/D04" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b19c5" view_id="@id/D05" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1a06" view_id="@id/D06" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b19e6" view_id="@id/D07" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1934" view_id="@id/D08" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1971" view_id="@id/D09" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1987" view_id="@id/D10" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b198e" view_id="@id/D01" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b199d" view_id="@id/C02" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b18f7" view_id="@id/C03" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b191b" view_id="@id/C04" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b191f" view_id="@id/C05" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b192e" view_id="@id/C06" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1945" view_id="@id/C07" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1949" view_id="@id/C08" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1951" view_id="@id/C09" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b195e" view_id="@id/B07" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b19fe" view_id="@id/D02" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1a03" view_id="@id/B02" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b18e9" view_id="@id/B03" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b19fb" view_id="@id/B04" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b19fb" view_id="@id/B04_dup" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b18e4" view_id="@id/B05" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1965" view_id="@id/B06" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b2303" view_id="@id/C10" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b0892" view_id="@id/C10" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b0cf4" view_id="@id/B08" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b129b" view_id="@id/B09" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b0df7" view_id="@id/D11" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b232f" view_id="@id/D11" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b17f7" view_id="@id/C01" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b18ad" view_id="@id/B01" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1813" view_id="@id/D03" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1878" view_id="@id/D04" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1886" view_id="@id/D05" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b18a9" view_id="@id/D06" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1890" view_id="@id/D07" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1838" view_id="@id/D08" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1860" view_id="@id/D09" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1875" view_id="@id/D10" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1877" view_id="@id/D01" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b187d" view_id="@id/C02" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b180f" view_id="@id/C03" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1826" view_id="@id/C04" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1828" view_id="@id/C05" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1833" view_id="@id/C06" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1849" view_id="@id/C07" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b184b" view_id="@id/C08" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b184f" view_id="@id/C09" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1853" view_id="@id/B07" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b18a5" view_id="@id/D02" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b18a8" view_id="@id/B02" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1808" view_id="@id/B03" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b18a3" view_id="@id/B04" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b18a3" view_id="@id/B04_dup" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1806" view_id="@id/B05" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1857" view_id="@id/B06" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b0cf9" view_id="@id/B08" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b129b" view_id="@id/B09" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b2413" view_id="@id/B08" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b129b" view_id="@id/B09" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b2837" view_id="@id/E00" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b1f98" view_id="@id/E11" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b22fd" view_id="@id/E12" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b103a" view_id="@id/B08" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b2305" view_id="@id/B09" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b0dfa" view_id="@id/D11" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b287e" view_id="@id/D11" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b2303" view_id="@id/C10" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b2305" view_id="@id/C10" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b0df1" view_id="@id/C10" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b0fdf" view_id="@id/C10" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b0d3d" view_id="@id/C10" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b2355" view_id="@id/C10" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b235a" view_id="@id/C10" />
        <mapping key_id="@id/APKTOOL_DUMMYVAL_0x7f0b246c" view_id="@id/C10" />
    </key_mapping>
</framework>
"""

private val MERGE_XML = """
<?xml version="1.0" encoding="utf-8"?>
<framework>
    <include href="@xml/APKTOOL_DUMMYVAL_0x7f170493" />
    <keyboard>
        <if keyboard_mode="split">
            <if split_with_duplicate_keys="true">
                <view layout="@layout/APKTOOL_DUMMYVAL_0x7f0e02c3" type="body" />
            </if>
            <else>
                <view layout="@layout/APKTOOL_DUMMYVAL_0x7f0e02c4" type="body" />
            </else>
        </if>
        <else>
            <view layout="@layout/APKTOOL_DUMMYVAL_0x7f0e02c2" type="body" />
        </else>
        <view type="body">
            <softkeys href="@xml/APKTOOL_DUMMYVAL_0x7f170f40" />
            <include href="@xml/qwerty_apostrophe_key_mapping" />
            <include href="@xml/APKTOOL_DUMMYVAL_0x7f170c04" />
        </view>
    </keyboard>
    <include href="@xml/APKTOOL_DUMMYVAL_0x7f17078d" />
    <if enable_number_row="true">
        <include href="@xml/APKTOOL_DUMMYVAL_0x7f17075b" />
    </if>
</framework>
"""

private val GROUP_XML = """
<?xml version="1.0" encoding="utf-8"?>
<framework pk_language_tag="">
    <keyboard_group pk_language_tag="{pk_language_tag}" supports_split_mode="true" variant="qwerty_apostrophe" variant_label="@string/layout_qwerty_apostrophe">
        <include href="@xml/APKTOOL_DUMMYVAL_0x7f170002" support_a11y_keyboard="true" />
        <keyboard def="{lang_def}" type="prime">
            <merge def="@xml/qwerty_apostrophe_merge" />
        </keyboard>
        <include href="@xml/APKTOOL_DUMMYVAL_0x7f17090f" />
    </keyboard_group>
</framework>
"""

@Suppress("unused")
val qwertyApostropheLayoutPatch = resourcePatch(
    name = "QWERTY + apostrophe layout",
    description = "Adds a QWERTY layout with a dedicated apostrophe key to the English (US) layout picker.",
    default = true,
) {
    // Adjust to however the template declares compatibility (package only is fine).
    compatibleWith("com.google.android.inputmethod.latin")

    execute {
        val xmlDir = get("res/xml")

        // Safety: make sure the files this layout builds on exist in this Gboard build.
        for (id in listOf("0493", "0f40", "0c04", "078d", "075b", "0002", "090f", "0555")) {
            check(xmlDir.resolve(X + id + ".xml").exists()) {
                "Gboard resource 0x7f17$id not found; this patch targets Gboard 18.5.4."
            }
        }

        xmlDir.resolve("qwerty_apostrophe_key_mapping.xml").writeText(MAPPING_XML.trimStart())
        xmlDir.resolve("qwerty_apostrophe_merge.xml").writeText(MERGE_XML.trimStart())
        xmlDir.resolve("qwerty_apostrophe_group.xml").writeText(GROUP_XML.trimStart())

        // Picker label.
        val strings = get("res/values/strings.xml")
        strings.writeText(
            strings.readText().replace(
                "</resources>",
                "    <string name=\"layout_qwerty_apostrophe\">QWERTY + \\'</string>\n</resources>",
            ),
        )

        // Register the layout in the English (US) IME definition.
        val ime = xmlDir.listFiles()!!.first {
            it.extension == "xml" && it.length() < 20_000 &&
                it.readText().contains("string_id=\"ime_english_united_states\"")
        }
        val marker = "<if enable_pk_simulator=\"true\">"
        val text = ime.readText()
        check(text.contains(marker)) { "Unexpected en-US IME definition layout." }
        ime.writeText(
            text.replaceFirst(
                marker,
                "<include href=\"@xml/qwerty_apostrophe_group\" lang_def=\"@xml/${X}0555\" />\n        $marker",
            ),
        )
    }
}
